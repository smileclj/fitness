package com.dasx.fitness.common.enums;

public enum ErrorCode {
	SUCCESS(0, "成功"), 
	ERROR_PARAM(1, "参数错误"),
	ERROR_REPEAT(2, "重复操作"), 
	ACTION_NOT_EXIST(3, "接口不存在"),
	ERROR_LOGIN(4,"登录失败,用户名或密码错误"),
	ERROR_DATA(5,"数据有误，请稍后再试"),
	UNKNOW(-1, "系统异常");

	private ErrorCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	/**
	 * code码
	 */
	private int code;
	/**
	 * code信息
	 */
	private String msg;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 根据code码查找
	 */
	public static ErrorCode getByCode(int code) {
		ErrorCode result = UNKNOW;
		for (ErrorCode p : ErrorCode.values()) {
			if (p.getCode() == code) {
				result = p;
			}
		}
		return result;
	}

	/**
	 * 根据name查找
	 */
	public static ErrorCode getByMsg(String msg) {
		ErrorCode result = UNKNOW;
		for (ErrorCode p : ErrorCode.values()) {
			if (p.getMsg().equals(msg)) {
				result = p;
			}
		}
		return result;
	}
}
