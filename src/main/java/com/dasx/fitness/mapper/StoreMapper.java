package com.dasx.fitness.mapper;

import com.dasx.fitness.entity.Store;
import com.dasx.fitness.entity.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    int countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}