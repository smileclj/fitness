package com.dasx.fitness.common.util;

public class ValidateUtil {
	public static boolean validate(Object... objs) {
		for (Object obj : objs) {
			if (obj instanceof String) {
				if (StringUtil.isEmpty((String) obj)) {
					return false;
				}
			} else {
				if (obj == null) {
					return false;
				}
			}
		}
		return true;
	}
}
