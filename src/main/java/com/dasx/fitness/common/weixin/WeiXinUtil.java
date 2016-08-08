package com.dasx.fitness.common.weixin;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.dasx.fitness.common.util.DateUtil;
import com.dasx.fitness.common.util.HttpUtils;
import com.dasx.fitness.common.weixin.CustomMenu.CustomButton;
import com.dasx.fitness.common.weixin.Qrcode.QrCodeRequest;
import com.dasx.fitness.common.weixin.Qrcode.QrCodeResponse;
import com.dasx.fitness.common.weixin.msg.active.AbstractMessage;
import com.dasx.fitness.common.weixin.msg.active.NewsMessage;
import com.dasx.fitness.common.weixin.msg.active.TextMessage;

public class WeiXinUtil {
	private final static Map<String,Object> weixinMap=new HashMap<String,Object>();
	private final static String KEY_MAP_TOKEN="map_token";
	private final static String KEY_MAP_JSTICKET="map_jsticket";
	
	
	public static String getOpenIdByCode(String code) {
	String result = HttpUtils.doGet(WeiXinUrls.getOpenIdUrl(code));
	JSONObject json=JSONObject.parseObject(result);
	return json.getString("openid");
}
	
	public static String getToken() {
		AccessToken token=(AccessToken) weixinMap.get(KEY_MAP_TOKEN);
		if(token==null){
			return refreshToken();
		}
		if(DateUtil.getMarginSeconds(new Date(), token.getCacheTime())>token.getExpires_in()){
			return refreshToken();
		}
		return token.getAccess_token();
	}
	
	private static String refreshToken(){
		String result=HttpUtils.doGet(WeiXinUrls.getTokenUrl());
		AccessToken accessToken=JSONObject.parseObject(result, AccessToken.class);
		accessToken.setCacheTime(new Date());
		weixinMap.put(KEY_MAP_TOKEN, accessToken);
		return accessToken.getAccess_token();
	}
	
	// 打log监控所有经过的地方
	public static String getJsSDKTicket() {
		JsTicket ticket=(JsTicket) weixinMap.get(KEY_MAP_JSTICKET);
		if(DateUtil.getMarginSeconds(new Date(), ticket.getCacheTime())>ticket.getExpires_in()){
			return refreshJsSDKTicket();
		}
		String result = HttpUtils.doGet(WeiXinUrls.getJsSDKUrl(getToken()));
		JSONObject jsSDKTicketObj=JSONObject.parseObject(result);
		if(jsSDKTicketObj.getIntValue("errcode")==40001){//TOKEN失效
			result = HttpUtils.doGet(WeiXinUrls.getJsSDKUrl(refreshToken()));
			jsSDKTicketObj=JSONObject.parseObject(result);
		}
		String jsSDKTicketStr = jsSDKTicketObj.getString("ticket");
		return jsSDKTicketStr;
	}
	
	private static String refreshJsSDKTicket(){
		String result=HttpUtils.doGet(WeiXinUrls.getTokenUrl());
		AccessToken accessToken=JSONObject.parseObject(result, AccessToken.class);
		accessToken.setCacheTime(new Date());
		weixinMap.put(KEY_MAP_JSTICKET, accessToken);
		return accessToken.getAccess_token();
	}
	
	 /**
     * 发送一个主动消息（文本、图片、语音、视频、音乐、图文）
     * @param message
     *            消息（文本、图片、语音、视频、音乐、图文）
     * @throws WeixinException
     *             如果发生错误
     */
    private  static void sendMessae(AbstractMessage message) throws WeixinException {
    	postWithJson(WeiXinUrls.getCustomerSendUrl(getToken()),message, GlobalError.class);
    }
    /**
     * 主动发送一个文本消息
     * @param toUser
     *            接收用户的OpenID
     * @param content
     *            发送内容
     * @throws WeixinException
     *             如果发送业务错误
     */
    public static void sendText(String toUser, String content) throws WeixinException {
    	TextMessage msg = new TextMessage();
        msg.touser = toUser;
        msg.addContent(content);
        sendMessae(msg);
    }
    /**
     * 主动发送一组文章消息
     * @param toUser
     *            接收用户的OpenID
     * @param news
     *            文章消息，至少添加一个Article，最多10个
     * @throws WeixinException
     *             如果发送业务错误
     */
    public static void sendNews(String toUser, NewsMessage.News news) throws WeixinException {
        NewsMessage msg = new NewsMessage();
        msg.touser = toUser;
        msg.news = news;
        sendMessae(msg);
    }
   
    /**
     * 更新菜单
     * @param customMenu
     * @throws WeixinException
     */
    public static void updateMenu(CustomButton customButton) throws WeixinException {
    	postWithJson(WeiXinUrls.getMenuCreateUrl(getToken()),customButton, GlobalError.class);
    }
    
   
    /**
     * 申请带参数二维码
     * @author zwt
     * @param type 类型，永久或者临时
     * @param sceneId 场景值ID，临时二维码时为32位非0整型，永久二维码时最大值为100000（目前参数只支持1--100000）
     * @param expreSeconds 该二维码有效时间，以秒为单位。 最大不超过1800。申请临时二维码时使用，永久二维码不使用。
     * @return 微信服务器返回ticket和有效时间
     * @throws WeixinException 如果发生错误
     */
    public static QrCodeResponse createQrcode(QrCodeRequest.TYPE type, Integer sceneId,String sceneStr, Integer expreSeconds) throws WeixinException {
    		 QrCodeRequest qrcode = new QrCodeRequest(type, sceneId, sceneStr,expreSeconds);
    		 return postWithJson(WeiXinUrls.getQrcodeCreateUrl(getToken()), qrcode, QrCodeResponse.class);
    }

    
    protected static final <T> T postWithJson(String url, Object param, Class<T> returnType) throws WeixinException{
    	HttpPost post = new HttpPost(url);
    	post.addHeader("Content-Type", "text/xml");
		post.setEntity(new StringEntity( JSONObject.toJSONString(param),"UTF-8"));
		String httpResult = HttpUtils.excute(post);
			GlobalError error =JSONObject.parseObject(httpResult, GlobalError.class);
			if(error.errcode!=null){
				 if (error.errcode == 40001) {
	                 // 如果token超时则重新获取
	                 // 重新请求
	                 url = url.replaceAll("access_token=[^&]+", "access_token=" +refreshToken());
	                 return postWithJson(url, param, returnType);
	             }
				if(error.errcode!=0){//
					throw new WeixinException(error.errcode,error.errmsg,null);
				}
			}
		T obj =null;
		try{
			obj=JSONObject.parseObject(httpResult, returnType);
		}catch(JSONException e){
			throw new WeixinException(url, "调用失败："+e.getMessage(), e.getCause());
		}
		return obj;
    }
}
