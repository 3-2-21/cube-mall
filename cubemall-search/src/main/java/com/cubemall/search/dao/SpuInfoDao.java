package com.cubemall.search.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cubemall.search.entity.SpuInfoEntity;
import com.cubemall.search.model.SpuInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * spu信息
 * 
 *
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {

    SpuInfo getSpuInfoById(Long spuId);
    List<SpuInfo> getSpuInfoList();
	
}
