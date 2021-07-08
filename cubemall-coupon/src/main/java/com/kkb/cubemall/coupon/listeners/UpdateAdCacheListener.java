package com.kkb.cubemall.coupon.listeners;

import okhttp3.*;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 目标：接受书同步为服务消息刷新REDIS缓存
 * 实现步骤：1.搭建运营微服务
 *         2.配置依赖和编写启动引导类
 *         3.编写监听器，监听消息队列，执行更新刷新缓存逻辑
 */
@Component
@RabbitListener(queues = "ad_update_queue")
public class UpdateAdCacheListener {
    /**
     * 获取更新广告通知
     * @param message
     */
    @RabbitHandler//监听方法
    public void updateAd(String message){
        System.out.println("接收到消息："+message);
        //刷新缓存
        String url = "http://192.168.56.100/ad_update?position=web_index_lb";
        OkHttpClient okHttpClient = new OkHttpClient();
        //构建请求对象
        final Request request = new Request.Builder().url(url).build();
        //客户端发送请求
        Call call = okHttpClient.newCall(request);
        //设置回调监听：监听响应对象的内容
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();//显示错误信息
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println("调用成功"+response.message());
            }
        });
    }
}

