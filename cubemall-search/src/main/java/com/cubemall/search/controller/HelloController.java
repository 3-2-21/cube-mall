package com.cubemall.search.controller;

import com.kkb.cubemall.common.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello/{name}")
    public R sayHello(@PathVariable String name){
        return R.ok("hello"+ name);
    }

    @GetMapping("hello")
    public R sayHello2(String name){
        return R.ok("hello"+ name);
    }
}
