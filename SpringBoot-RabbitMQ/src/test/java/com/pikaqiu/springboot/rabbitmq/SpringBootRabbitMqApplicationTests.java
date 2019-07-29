package com.pikaqiu.springboot.rabbitmq;

import com.pikaqiu.springboot.rabbitmq.product.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRabbitMqApplicationTests {

    @Autowired
    private Product product;

    @Test
    public void contextLoads() {
        String text = "当前时间：" + new Date();
        product.send(text);
    }

}
