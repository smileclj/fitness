package com.dasx.fitness.common.interceptors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.dasx.fitness.common.enums.ErrorCode;
import com.dasx.fitness.common.exceptions.FitnessException;
import com.dasx.fitness.common.resp.BaseResp;

public class ExceptionInterceptor implements HandlerExceptionResolver {
	private final static Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest req, HttpServletResponse resp, Object handler,
			Exception e) {
		try {
			resp.setContentType("application/json; charset=utf-8");
			PrintWriter writer = resp.getWriter();
			BaseResp<Integer> result = new BaseResp<Integer>();
			if (e instanceof FitnessException) {
				FitnessException PrivilegeException = (FitnessException) e;
				StringBuilder sb = new StringBuilder();
				sb.append(e.getMessage()).append("-");
				String[] paramNames = PrivilegeException.getParamNames();
				if (paramNames.length > 0) {
					for (String paramName : paramNames) {
						sb.append(paramName).append(":{},");
					}
					logger.error(sb.toString().substring(0, sb.toString().length() - 1),
							PrivilegeException.getParamValues());
				} else {
					logger.error(e.getMessage(), e);
				}
				result.setError(PrivilegeException.getErrorCode());
			}
			// 主键冲突
			else if (e instanceof org.springframework.dao.DuplicateKeyException) {
				logger.error(e.getMessage(), e);
				result.setError(ErrorCode.ERROR_REPEAT);
			}
			// 连接异常
			else if (e.getCause() instanceof java.net.ConnectException) {
				logger.error(e.getMessage(), e);
				result.setError(ErrorCode.ACTION_NOT_EXIST);
			} else {
				// 未知错误，打印堆栈
				e.printStackTrace();
				logger.error(e.getMessage(), e);
				result.setError(ErrorCode.UNKNOW);
			}
			writer.write(JSON.toJSONString(result));
			return new ModelAndView();
		} catch (IOException e1) {
			logger.error("ExceptionInterceptor io error", e1);
		} finally {
			try {
				resp.getWriter().close();
			} catch (IOException e2) {
				logger.error("ExceptionInterceptor  close error", e2);
			}
		}
		return null;
	}
}
