package com.dasx.fitness.mapper;

import com.dasx.fitness.entity.userCourseCancleLog;
import com.dasx.fitness.entity.userCourseCancleLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userCourseCancleLogMapper {
    int countByExample(userCourseCancleLogExample example);

    int deleteByExample(userCourseCancleLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(userCourseCancleLog record);

    int insertSelective(userCourseCancleLog record);

    List<userCourseCancleLog> selectByExample(userCourseCancleLogExample example);

    userCourseCancleLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") userCourseCancleLog record, @Param("example") userCourseCancleLogExample example);

    int updateByExample(@Param("record") userCourseCancleLog record, @Param("example") userCourseCancleLogExample example);

    int updateByPrimaryKeySelective(userCourseCancleLog record);

    int updateByPrimaryKey(userCourseCancleLog record);
}