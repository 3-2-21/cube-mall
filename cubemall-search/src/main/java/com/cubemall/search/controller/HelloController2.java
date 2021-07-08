package com.cubemall.search.controller;

import com.cubemall.search.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring5.SpringTemplateEngine;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController2 {
    //可以使用SpringTemplateEngine对象，生成静态页面
    @Autowired
    private SpringTemplateEngine engine;
    @GetMapping("/html/hello")
    //返回String类型，默认使用SPRING MVC的视图解析器
    public String sayHello(Model model){
        //向context对象中添加模板使用的变量
        model.addAttribute("hello","hello world");
        model.addAttribute("html","<div>hello world</div>");
        List<User> userList =new ArrayList<>();
        userList.add(new User(1,"Tim","北京",new Date()));
        userList.add(new User(2,"Jim","北京",new Date()));
        userList.add(new User(3,"Tom","北京",new Date()));
        userList.add(new User(4,"Lily","北京",new Date()));
        userList.add(new User(5,"Lucy","北京",new Date()));
        userList.add(new User(6,"Bob","北京",new Date()));
        model.addAttribute("userList",userList);
        model.addAttribute("flag",true);
        //返回模板文件名称
        return "hello";
    }
}
