package com.dasx.fitness.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dasx.fitness.dto.course.Course;

@Repository
public interface CourseMapperExt extends CourseMapper {
	
	public List<Course> queryCourse(@Param("storeId") Integer storeId,@Param("startTime") Date  startTime,@Param("endTime")Date endDate);
}