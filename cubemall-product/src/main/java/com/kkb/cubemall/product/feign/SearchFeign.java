package com.kkb.cubemall.product.feign;

import com.kkb.cubemall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cubemall-search")
public interface SearchFeign {
    @GetMapping("hello/{name}")
    R sayHello(@PathVariable("name") String name);

    @GetMapping("hello/{name}")
    R sayHello2(@RequestParam("name") String name);

    @GetMapping("/spuinfo/putonsale/{spuId}")
    R putOnSale(@PathVariable("spuId") Long spuId);
}
