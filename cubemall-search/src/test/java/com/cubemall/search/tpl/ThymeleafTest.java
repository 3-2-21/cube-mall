package com.cubemall.search.tpl;

import com.cubemall.search.model.User;
import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThymeleafTest {
    @Test
    public void testThymeleaf() throws Exception{
        //创建一个给予classpath的加载器
        ClassLoaderTemplateResolver templateResolver=new ClassLoaderTemplateResolver();
        //设置加载器的属性，前缀和后缀
        templateResolver.setPrefix("templates/");
        templateResolver.setSuffix(".html");
        //创建一个模板引擎
        TemplateEngine engine =new TemplateEngine();
        engine.setTemplateResolver(templateResolver);
        //创建一个Context对象，相当于一个map向模板传递数据时需要使用
        Context context = new Context();
        //向context对象中添加模板使用的变量
        context.setVariable("hello","hello world");
        context.setVariable("html","<div>hello world</div>");
        List<User> userList =new ArrayList<>();
        userList.add(new User(1,"Tim","北京",new Date()));
        userList.add(new User(2,"Jim","北京",new Date()));
        userList.add(new User(3,"Tom","北京",new Date()));
        userList.add(new User(4,"Lily","北京",new Date()));
        userList.add(new User(5,"Lucy","北京",new Date()));
        userList.add(new User(6,"Bob","北京",new Date()));
        context.setVariable("userList",userList);
        context.setVariable("flag",true);
        //渲染模板，模板所在的位置使用的context对象，静态文件生成的路径
        FileWriter writer =new FileWriter("E:/hello.html");
        engine.process("hello",context,writer);

    }

}
