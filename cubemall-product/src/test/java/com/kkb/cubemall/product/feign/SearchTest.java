package com.kkb.cubemall.product.feign;

import com.kkb.cubemall.common.utils.R;
import com.kkb.cubemall.product.CubemallProductApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CubemallProductApplication.class)
public class SearchTest {
    @Autowired
    private SearchFeign searchFeign;

    @Test
    public void testSayHello(){
        R r = searchFeign.sayHello("tom");
        System.out.println(r);
    }

    @Test
    public void testSayHello2(){
        R r = searchFeign.sayHello2("露西");
        System.out.println(r);
    }

}
