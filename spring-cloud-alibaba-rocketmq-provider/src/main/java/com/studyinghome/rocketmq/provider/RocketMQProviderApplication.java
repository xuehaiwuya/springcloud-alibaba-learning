package com.studyinghome.rocketmq.provider;

import com.studyinghome.rocketmq.provider.service.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;


/**
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/03
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableBinding(MySource.class)
public class RocketMQProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketMQProviderApplication.class, args);
    }


}
