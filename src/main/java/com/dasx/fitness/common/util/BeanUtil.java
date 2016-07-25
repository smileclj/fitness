package com.dasx.fitness.common.util;

import java.util.HashMap;
import java.util.Map;

import net.sf.cglib.beans.BeanCopier;

public class BeanUtil {

	private static final Map<String, BeanCopier> BEAN_COPIERS = new HashMap<String, BeanCopier>();

	private static String genKey(Class<?> srcClazz, Class<?> destClazz) {
		return srcClazz.getName() + destClazz.getName();
	}

	public static void copyProperties(Object dest, Object src) {
		String key = genKey(src.getClass(), dest.getClass());
		BeanCopier copier = null;
		if (!BEAN_COPIERS.containsKey(key)) {
			copier = BeanCopier.create(src.getClass(), dest.getClass(), false);
			BEAN_COPIERS.put(key, copier);
		} else {
			copier = BEAN_COPIERS.get(key);
		}
		copier.copy(src, dest, null);
	}
}
