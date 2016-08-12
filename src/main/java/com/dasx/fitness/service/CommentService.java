package com.dasx.fitness.service;

import java.util.List;

import com.dasx.fitness.dto.comment.CourseComment;

public interface CommentService {
	
	List<CourseComment> getCourseComments(Integer courseId);
}
