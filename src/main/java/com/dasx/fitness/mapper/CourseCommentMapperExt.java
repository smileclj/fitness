package com.dasx.fitness.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dasx.fitness.dto.comment.CourseComment;

@Repository
public interface CourseCommentMapperExt extends CourseCommentMapper {
	
	public List<CourseComment> queryCourseComments(Integer courseId);
	
}