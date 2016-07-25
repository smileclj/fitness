package com.dasx.fitness.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dasx.fitness.entity.User;
import com.dasx.fitness.mapper.UserMapperExt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class MapperTest {
	@Resource
	private UserMapperExt userMapperExt;

	@Test
	public void userMapperExt(){
		User user = new User();
		user.setUserName("小明");
		userMapperExt.insertSelective(user);
	}
}
