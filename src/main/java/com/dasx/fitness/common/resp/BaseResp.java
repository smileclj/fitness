package com.dasx.fitness.common.resp;

import com.dasx.fitness.common.enums.ErrorCode;

public class BaseResp<T> {
	private int errcode; // 返回码
	private String errmsg; // 返回说明
	private long serverTime; // 服务器时间
	private T data; // 返回内容

	public BaseResp() {
		this.serverTime = System.currentTimeMillis();
	}

	public BaseResp(ErrorCode errorCode) {
		this.errcode = errorCode.getCode();
		this.errmsg = errorCode.getMsg();
		this.serverTime = System.currentTimeMillis();
	}

	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(ErrorCode errcode) {
		this.errcode = errcode.getCode();
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(ErrorCode errcode) {
		this.errmsg = errcode.getMsg();
	}

	public long getServerTime() {
		return serverTime;
	}

	public void setServerTime(long serverTime) {
		this.serverTime = serverTime;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setError(ErrorCode errcode) {
		this.errcode = errcode.getCode();
		this.errmsg = errcode.getMsg();
	}
}
