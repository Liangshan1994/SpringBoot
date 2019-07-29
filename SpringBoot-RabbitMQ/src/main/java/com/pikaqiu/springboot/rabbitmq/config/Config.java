package com.pikaqiu.springboot.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 吕梁山
 * @date 2019/7/29
 */
@Configuration
public class Config {

    @Bean
    public Queue testQueue(){
        return new Queue("queues_test");
    }
}
