package com.dasx.fitness.mapper;

import com.dasx.fitness.entity.CourseComment;
import com.dasx.fitness.entity.CourseCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseCommentMapper {
    int countByExample(CourseCommentExample example);

    int deleteByExample(CourseCommentExample example);

    int deleteByPrimaryKey(Integer courseCommentId);

    int insert(CourseComment record);

    int insertSelective(CourseComment record);

    List<CourseComment> selectByExample(CourseCommentExample example);

    CourseComment selectByPrimaryKey(Integer courseCommentId);

    int updateByExampleSelective(@Param("record") CourseComment record, @Param("example") CourseCommentExample example);

    int updateByExample(@Param("record") CourseComment record, @Param("example") CourseCommentExample example);

    int updateByPrimaryKeySelective(CourseComment record);

    int updateByPrimaryKey(CourseComment record);
}