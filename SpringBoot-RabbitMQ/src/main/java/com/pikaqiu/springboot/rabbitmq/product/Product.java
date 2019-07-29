package com.pikaqiu.springboot.rabbitmq.product;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 吕梁山
 * @date 2019/7/29
 */
@Component
public class Product {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String text){
        String queuesName = "queues_test";
        System.out.println("生产消息:" + text);
        rabbitTemplate.convertAndSend(queuesName, text);
    }

}
