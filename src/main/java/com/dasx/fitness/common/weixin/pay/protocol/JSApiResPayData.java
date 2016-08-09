package com.dasx.fitness.common.weixin.pay.protocol;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.oxm.annotations.XmlCDATA;

@XmlRootElement(name = "xml")
public class JSApiResPayData {
	 //协议层
	@XmlCDATA @XmlElement(name="return_code") private String returnCode;
	@XmlCDATA @XmlElement(name="return_msg") private String returnMsg;
    
    //协议返回的具体数据（以下字段在return_code 为SUCCESS 的时候有返回）
	@XmlCDATA @XmlElement(name="appid")  private String appid;
	@XmlCDATA @XmlElement(name="mch_id") private String mchId;
	@XmlCDATA @XmlElement(name="nonce_str") private String nonceStr;
	@XmlCDATA @XmlElement(name="sign") private String sign;
	@XmlCDATA @XmlElement(name="result_code") private String resultCode ;
	@XmlCDATA @XmlElement(name="err_code") private String errCode;
	@XmlCDATA @XmlElement(name="err_code_des") private String errCodeDes;
	@XmlCDATA @XmlElement(name="device_info") private String deviceInfo;
    
	@XmlCDATA @XmlElement(name="trade_type") private String tradeType;
	@XmlCDATA @XmlElement(name="prepay_id") private String prepayId;
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMsg() {
		return returnMsg;
	}
	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
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
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCodeDes() {
		return errCodeDes;
	}
	public void setErrCodeDes(String errCodeDes) {
		this.errCodeDes = errCodeDes;
	}
	public String getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getPrepayId() {
		return prepayId;
	}
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}
}
