package com.dasx.fitness.controller.weixin;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dasx.fitness.common.util.JaxbXmlUtil;
import com.dasx.fitness.common.weixin.Configure;
import com.dasx.fitness.common.weixin.msg.ReceivedMessage;
import com.dasx.fitness.common.weixin.msg.WeiXinMsgType;


@Controller
public class WeiXinMsgController {
	private final static Logger log = LoggerFactory.getLogger(WeiXinMsgController.class);

	@RequestMapping(value="weixin/msg", method = RequestMethod.GET)
	@ResponseBody
	public String access(@RequestParam Map<String,String> params) {
		String[] verifyInfo = { 
			Configure.getDevToken(), params.get("timestamp") /*时间戳*/, params.get("nonce")/*随机数*/ };
		Arrays.sort(verifyInfo);
		String bigStr = verifyInfo[0] + verifyInfo[1] + verifyInfo[2];  
		String digest = DigestUtils.sha1Hex(bigStr);
		String signature = params.get("signature");
		System.out.println(digest);
		if (digest.equals(signature)) {  
			return params.get("echostr");
		} 

		return "error";
	}

	@RequestMapping(value="weixin/msg", method = RequestMethod.POST)
	@ResponseBody
	public String message(@RequestParam Map<String,String> params,@PathVariable String originalId, HttpServletRequest request) {
		try {
			ReceivedMessage receivedMsg =JaxbXmlUtil.readConfigFromReader(ReceivedMessage.class,request.getReader());
			if(WeiXinMsgType.isInput(receivedMsg.getMsgType())){
				return sendXMLToWeiXin(null);
			}
			return StringUtils.EMPTY;
		} catch (Exception ex) {
			return StringUtils.EMPTY;
		}
	}
	private String sendXMLToWeiXin(Object message) throws JAXBException {
		if(message==null){
			return StringUtils.EMPTY;
		}
		return JaxbXmlUtil.toXML(message);
	}
}