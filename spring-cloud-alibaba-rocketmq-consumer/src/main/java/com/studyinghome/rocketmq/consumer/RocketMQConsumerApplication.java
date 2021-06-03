package com.studyinghome.rocketmq.consumer;

import com.studyinghome.rocketmq.consumer.service.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;


/**
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({MySink.class})
public class RocketMQConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketMQConsumerApplication.class, args);
    }
}
