package com.dasx.fitness.service;


public interface UserCourseService {

	void queueUpCourse(Integer userId,Integer coursePlanId);
	
	
	void cancelQueueCourse(Integer userId,Integer coursePlanId);
}
