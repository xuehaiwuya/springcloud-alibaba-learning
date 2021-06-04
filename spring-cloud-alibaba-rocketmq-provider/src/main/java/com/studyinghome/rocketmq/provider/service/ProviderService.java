package com.studyinghome.rocketmq.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 提供者服务
 *
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/03
 */
@Service
public class ProviderService {
    @Autowired
    private SenderService senderService;


    /**
     * 发送字符串消息
     *
     * @param msg
     */
    public void send(String msg) {
        senderService.send(msg);
    }

    /**
     * 发送带tag字符串消息
     *
     * @param msg
     */
    public void sendWithTags(String msg) {
        senderService.sendWithTags(msg, "strTag");
    }

    /**
     * 发送Object对象消息
     *
     * @param foo
     */
    public void sendObject(Foo foo) {
        senderService.sendObject(foo, "objTag");
    }

}
