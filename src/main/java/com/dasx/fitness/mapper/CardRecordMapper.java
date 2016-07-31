package com.dasx.fitness.mapper;

import com.dasx.fitness.entity.CardRecord;
import com.dasx.fitness.entity.CardRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardRecordMapper {
    int countByExample(CardRecordExample example);

    int deleteByExample(CardRecordExample example);

    int deleteByPrimaryKey(Integer cardRecordId);

    int insert(CardRecord record);

    int insertSelective(CardRecord record);

    List<CardRecord> selectByExample(CardRecordExample example);

    CardRecord selectByPrimaryKey(Integer cardRecordId);

    int updateByExampleSelective(@Param("record") CardRecord record, @Param("example") CardRecordExample example);

    int updateByExample(@Param("record") CardRecord record, @Param("example") CardRecordExample example);

    int updateByPrimaryKeySelective(CardRecord record);

    int updateByPrimaryKey(CardRecord record);
}