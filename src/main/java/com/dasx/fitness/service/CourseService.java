package com.dasx.fitness.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.dasx.fitness.dto.course.Course;



public interface CourseService {
	
	public List<Course> queryCourse(Integer storeId,String coursrTime);
	
	public JSONObject getStoreInfo(Integer cityId);
	
	public Course getCourseInfo(Integer courseId);
}
