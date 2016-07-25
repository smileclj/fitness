package com.dasx.fitness.common.util;

import java.util.UUID;

public class UUIDUtil {

	public static String create() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
