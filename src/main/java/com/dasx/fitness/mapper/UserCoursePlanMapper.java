package com.dasx.fitness.mapper;

import com.dasx.fitness.entity.UserCoursePlan;
import com.dasx.fitness.entity.UserCoursePlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCoursePlanMapper {
    int countByExample(UserCoursePlanExample example);

    int deleteByExample(UserCoursePlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserCoursePlan record);

    int insertSelective(UserCoursePlan record);

    List<UserCoursePlan> selectByExample(UserCoursePlanExample example);

    UserCoursePlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserCoursePlan record, @Param("example") UserCoursePlanExample example);

    int updateByExample(@Param("record") UserCoursePlan record, @Param("example") UserCoursePlanExample example);

    int updateByPrimaryKeySelective(UserCoursePlan record);

    int updateByPrimaryKey(UserCoursePlan record);
}