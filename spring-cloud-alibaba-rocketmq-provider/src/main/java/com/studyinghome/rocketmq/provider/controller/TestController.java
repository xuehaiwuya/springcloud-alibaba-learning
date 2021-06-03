package com.studyinghome.rocketmq.provider.controller;

import com.studyinghome.rocketmq.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/03
 */
@RestController
public class TestController {
    @Autowired
    private ProviderService providerService;

    @GetMapping("/test")
    public String run() {
        providerService.send("Hello RocketMQ");
        return "ok";
    }
}
