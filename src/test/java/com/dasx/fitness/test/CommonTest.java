package com.dasx.fitness.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenlj on 2016/8/7.
 */
public class CommonTest {
	@Test
	public void testFastJson() {
		Map<String, String> map = new HashMap<>();
		map.put("id", null);
		map.put("name", "小明");
		System.out.println(JSON.toJSONString(map));
	}

	@Test
	@SuppressWarnings("all")
	public void testSystem() {
		System.out.println(System.getProperty("user.dir"));

		// String filePath =
		// this.getClass().getResource("/spring/spring-dao.xml").getFile();
		// File file = new File(filePath);

		File file2 = new File(System.getProperty("user.dir") + "/src");
	}

	@Test
	@SuppressWarnings("all")
	public void testString() {
		String path = "com.a.b";
		String[] ps = path.split(".");
		
	}
}
