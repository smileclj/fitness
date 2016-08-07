package com.dasx.fitness.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

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
}
