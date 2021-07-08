package com.kkb.cubemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kkb.cubemall.common.utils.PageUtils;
import com.kkb.cubemall.common.utils.R;
import com.kkb.cubemall.product.entity.SpuInfoEntity;
import com.kkb.cubemall.product.exception.RemoteServiceCallException;
import com.kkb.cubemall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo spuSaveVo);

    PageUtils queryPageByConditon(Map<String, Object> params);

    R putOnSale(Long spuId) throws RemoteServiceCallException;

}

