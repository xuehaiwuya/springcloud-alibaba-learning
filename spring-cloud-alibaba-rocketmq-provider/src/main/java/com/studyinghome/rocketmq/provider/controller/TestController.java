package com.studyinghome.rocketmq.provider.controller;

import com.studyinghome.rocketmq.provider.service.Foo;
import com.studyinghome.rocketmq.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/03
 */
@RestController
public class TestController {
    @Autowired
    private ProviderService providerService;

    @RequestMapping(value = "/send")
    public String send(String msg) {
        providerService.send(msg);
        return "字符串消息发送成功!";
    }

    @RequestMapping(value = "/sendWithTags")
    public String sendWithTags(String msg) {
        providerService.sendWithTags(msg);
        return "带tag字符串消息发送成功!";
    }

    @RequestMapping(value = "/sendObject")
    public String sendObject(int index) {
        providerService.sendObject(new Foo(index, "foo"));
        return "Object对象消息发送成功!";
    }

}
