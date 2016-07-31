package com.dasx.fitness.mapper;

import com.dasx.fitness.entity.CoursePlan;
import com.dasx.fitness.entity.CoursePlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursePlanMapper {
    int countByExample(CoursePlanExample example);

    int deleteByExample(CoursePlanExample example);

    int deleteByPrimaryKey(Integer coursePlanId);

    int insert(CoursePlan record);

    int insertSelective(CoursePlan record);

    List<CoursePlan> selectByExample(CoursePlanExample example);

    CoursePlan selectByPrimaryKey(Integer coursePlanId);

    int updateByExampleSelective(@Param("record") CoursePlan record, @Param("example") CoursePlanExample example);

    int updateByExample(@Param("record") CoursePlan record, @Param("example") CoursePlanExample example);

    int updateByPrimaryKeySelective(CoursePlan record);

    int updateByPrimaryKey(CoursePlan record);
}