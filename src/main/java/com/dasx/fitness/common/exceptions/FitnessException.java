package com.dasx.fitness.common.exceptions;

import com.dasx.fitness.common.enums.ErrorCode;

//可提出到公共模块
public class FitnessException extends RuntimeException {
	private static final long serialVersionUID = -1392401239308639993L;
	protected ErrorCode code;
	private String[] paramNames = new String[] {};
	private Object[] paramValues = new Object[] {};

	public FitnessException(ErrorCode code) {
		super();
		this.code = code;
	}

	public FitnessException(ErrorCode code, String[] paramNames, Object[] paramValues) {
		super();
		this.code = code;
		this.paramNames = paramNames;
		this.paramValues = paramValues;
	}

	public FitnessException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code = code;
	}

	public FitnessException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		if (code != null) {
			return code.getMsg();
		} else {
			return null;
		}
	}

	public ErrorCode getErrorCode() {
		return this.code;
	}

	public String[] getParamNames() {
		return paramNames;
	}

	public Object[] getParamValues() {
		return paramValues;
	}

}
