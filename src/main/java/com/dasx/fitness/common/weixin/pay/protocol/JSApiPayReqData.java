package com.dasx.fitness.common.weixin.pay.protocol;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.dasx.fitness.common.weixin.Configure;
import com.dasx.fitness.common.weixin.pay.Signature;

@XmlRootElement(name = "xml")
public class JSApiPayReqData {
	@XmlElement(name="appid")  private String appid ;
	@XmlElement(name="mch_id") private String mchId;
	@XmlElement(name="device_info") private String deviceInfo ;
	@XmlElement(name="nonce_str") private String nonceStr;
	@XmlElement(name="sign") private String sign;
	@XmlElement(name="body") private String body;
	@XmlElement(name="out_trade_no") private String outTradeNo;
	@XmlElement(name="total_fee")  private Integer totalFee;
	@XmlElement(name="spbill_create_ip")  private String spbillCreateIp;
	@XmlElement(name="time_start") private String timeStart;
	@XmlElement(name="time_expire") private String timeExpire;
	@XmlElement(name="notify_url") private String notifyUrl;
	@XmlElement(name="trade_type") private String tradeType;
	@XmlElement(name="openid") private String openid;
	
	public JSApiPayReqData(String openId,String body,String outTradeNo,int totalFee,String spBillCreateIP,String timeStart,String timeExpire,String notifyUrl){
        setAppid(Configure.getAppid());
        setMchId(Configure.getMchid());
        setOpenid(openId);
        setBody(body);
        setOutTradeNo(outTradeNo);
        setTotalFee(totalFee);
        setDeviceInfo("WEB");
        setSpbillCreateIp(spBillCreateIP);
        setTimeStart(timeStart);
        setTimeExpire(timeExpire);
        setNonceStr(UUID.randomUUID().toString());
        setTradeType("JSAPI");
        setNotifyUrl(notifyUrl);
        sign = Signature.getSign(toMap());
        setSign(sign);//把签名数据设置到Sign这个属性中
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Integer getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Integer totalFee) {
		this.totalFee = totalFee;
	}

	public String getSpbillCreateIp() {
		return spbillCreateIp;
	}

	public void setSpbillCreateIp(String spbillCreateIp) {
		this.spbillCreateIp = spbillCreateIp;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getTimeExpire() {
		return timeExpire;
	}

	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	  public Map<String,Object> toMap(){
	        Map<String,Object> map = new HashMap<String, Object>();
	        Field[] fields = this.getClass().getDeclaredFields();
	        for (Field field : fields) {
	            Object obj;
	            try {
	                obj = field.get(this);
	                if(obj!=null){
	                    map.put(field.getName(), obj);
	                }
	            } catch (IllegalArgumentException e) {
	                e.printStackTrace();
	            } catch (IllegalAccessException e) {
	                e.printStackTrace();
	            }
	        }
	        return map;
	    }
}
