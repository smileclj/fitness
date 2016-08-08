package com.dasx.fitness.controller;

import com.dasx.fitness.common.enums.ErrorCode;
import com.dasx.fitness.common.resp.BaseResp;

public class BaseController {
	
	public static BaseResp<Integer> succeed(Object returnData) {
		return getResponseData(ErrorCode.SUCCESS, returnData);
	}
    
	public static BaseResp<Integer> failed(ErrorCode errcode) {
		return getResponseData(errcode, null);
	}
	
	private static BaseResp<Integer> getResponseData(ErrorCode errcode, Object data) {
		BaseResp obj = new BaseResp();
		obj.setData(data);
		obj.setError(errcode);
		return obj;
	}
}
