package com.dasx.fitness.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dasx.fitness.entity.CoursePlan;
import com.dasx.fitness.entity.UserCoursePlan;
import com.dasx.fitness.mapper.CoursePlanMapperExt;
import com.dasx.fitness.mapper.UserCoursePlanMapperExt;
import com.dasx.fitness.mapper.UserMapperExt;
import com.dasx.fitness.service.UserCourseService;
@Service
public class UserCourseServiceImpl implements UserCourseService{

	@Autowired
	private UserMapperExt	userMapperExt;
	@Autowired
	private CoursePlanMapperExt coursePlanMapperExt;
	@Autowired
	private UserCoursePlanMapperExt userCoursePlanMapperExt;
	
	
	
	@Transactional
	@Override
	public void queueUpCourse(Integer userId,Integer coursePlanId) {
			UserCoursePlan userCoursePlan =userCoursePlanMapperExt.query(userId, coursePlanId);
			if(userCoursePlan!=null){
				userCoursePlan.setState(getQueueState(coursePlanId));
				userCoursePlanMapperExt.updateByPrimaryKeySelective(userCoursePlan);
				return ;
			}
			userCoursePlan=new UserCoursePlan();
			userCoursePlan.setUserId(userId);
			userCoursePlan.setCoursePlanId(coursePlanId);
			userCoursePlan.setCreateTime(new Date());
			userCoursePlan.setState(getQueueState(coursePlanId));
			userCoursePlanMapperExt.insert(userCoursePlan);
	}

	private Integer getQueueState(Integer coursePlanId){
		return canOrder(coursePlanId)?2:1;
	}
	
	private boolean canOrder(Integer coursePlanId){
		CoursePlan coursePlan = coursePlanMapperExt
				.selectByPrimaryKey(coursePlanId);
		List<UserCoursePlan> userCoursePlans = userCoursePlanMapperExt
				.queryUserCourses(coursePlanId, 2);
		if (coursePlan.getStock() > userCoursePlans.size()) {
			return true;
		} 
		return false;
	}
	@Transactional
	@Override
	public void cancelQueueCourse(Integer userId, 
			Integer coursePlanId) {
		UserCoursePlan userCoursePlan =userCoursePlanMapperExt.query(userId, coursePlanId);
		userCoursePlan.setState(0);
		userCoursePlanMapperExt.updateByPrimaryKeySelective(userCoursePlan);
		List<UserCoursePlan> userCoursePlans = userCoursePlanMapperExt
				.queryUserCourses(coursePlanId, 1);
		if(!userCoursePlans.isEmpty()){
			UserCoursePlan queueUserCoursePlan=userCoursePlans.get(0);
			queueUserCoursePlan.setState(2);
			userCoursePlanMapperExt.updateByPrimaryKeySelective(queueUserCoursePlan);
		}
	}

	
}
