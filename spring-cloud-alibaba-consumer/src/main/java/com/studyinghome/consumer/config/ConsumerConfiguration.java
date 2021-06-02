package com.studyinghome.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * 消费者的配置
 *
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/02
 */
@Configuration
public class ConsumerConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
