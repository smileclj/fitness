package com.dasx.fitness.mapper;

import com.dasx.fitness.entity.CoachItem;
import com.dasx.fitness.entity.CoachItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoachItemMapper {
    int countByExample(CoachItemExample example);

    int deleteByExample(CoachItemExample example);

    int deleteByPrimaryKey(Integer coachItemId);

    int insert(CoachItem record);

    int insertSelective(CoachItem record);

    List<CoachItem> selectByExample(CoachItemExample example);

    CoachItem selectByPrimaryKey(Integer coachItemId);

    int updateByExampleSelective(@Param("record") CoachItem record, @Param("example") CoachItemExample example);

    int updateByExample(@Param("record") CoachItem record, @Param("example") CoachItemExample example);

    int updateByPrimaryKeySelective(CoachItem record);

    int updateByPrimaryKey(CoachItem record);
}