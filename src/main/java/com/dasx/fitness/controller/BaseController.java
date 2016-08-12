package com.dasx.fitness.controller;

import com.dasx.fitness.common.enums.ErrorCode;
import com.dasx.fitness.common.resp.BaseResp;

public class BaseController {
	
	public static <T>BaseResp<T> succeed(T returnData) {
		return getResponseData(ErrorCode.SUCCESS, returnData);
	}
    
	public static <T>BaseResp<T> failed(ErrorCode errcode) {
		return getResponseData(errcode, null);
	}
	
	private static <T>BaseResp<T> getResponseData(ErrorCode errcode, T data) {
		BaseResp<T> obj = new BaseResp<T>();
		obj.setData(data);
		obj.setError(errcode);
		return obj;
	}
}
