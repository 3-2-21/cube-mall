package com.cubemall.search.repository;

import com.cubemall.search.model.SpuInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface SpuInfoRepository extends ElasticsearchRepository<SpuInfo, Long> {

}
