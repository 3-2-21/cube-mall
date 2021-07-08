package com.cubemall.search.service;

import com.kkb.cubemall.common.utils.R;

import java.util.Map;


public interface SpuInfoService {
    public R putOnSale(long spuId);
    public R syncSpuInfo();
    Map<String, Object> search(Map<String,String> paramMap);
}
