package com.pikaqiu.springboot.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 吕梁山
 * @date 2019/7/29
 */
@Component
@RabbitListener(queues = "queues_test")
public class Consumer {


    @RabbitHandler
    public void process(String text){
        System.out.println("收到的消息：" + text);
    }
}
