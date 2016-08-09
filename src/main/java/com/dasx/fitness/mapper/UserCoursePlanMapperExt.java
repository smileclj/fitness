package com.dasx.fitness.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dasx.fitness.entity.UserCoursePlan;

@Repository
public interface UserCoursePlanMapperExt extends UserCoursePlanMapper {
	/**
	 * 根据userId和课程计划Id查询
	 * @param userId
	 * @param coursePlanId
	 * @return
	 */
	UserCoursePlan query(Integer userId,Integer coursePlanId);
	
	/**
	 * 根据课程计划Id和状态查询UserCoursePlan
	 * @param coursePlanId
	 * @param state
	 * @return
	 */
	List<UserCoursePlan> queryUserCourses(Integer coursePlanId,Integer state);
}