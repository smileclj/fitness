package com.dasx.fitness.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dasx.fitness.entity.Store;

@Repository
public interface StoreMapperExt extends StoreMapper {
	
	public List<Store> queryByAreaId(Integer areaId);
}