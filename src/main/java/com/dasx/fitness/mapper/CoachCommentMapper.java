package com.dasx.fitness.mapper;

import com.dasx.fitness.entity.CoachComment;
import com.dasx.fitness.entity.CoachCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoachCommentMapper {
    int countByExample(CoachCommentExample example);

    int deleteByExample(CoachCommentExample example);

    int deleteByPrimaryKey(Integer coachCommentId);

    int insert(CoachComment record);

    int insertSelective(CoachComment record);

    List<CoachComment> selectByExample(CoachCommentExample example);

    CoachComment selectByPrimaryKey(Integer coachCommentId);

    int updateByExampleSelective(@Param("record") CoachComment record, @Param("example") CoachCommentExample example);

    int updateByExample(@Param("record") CoachComment record, @Param("example") CoachCommentExample example);

    int updateByPrimaryKeySelective(CoachComment record);

    int updateByPrimaryKey(CoachComment record);
}