package com.studyinghome.rocketmq.consumer.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * 接收服务
 *
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/03
 */
@Service
public class ReceiveService {

    @StreamListener("input1")
    public void receiveInput1(String receiveMsg) {
        System.out.println("input1 receive: " + receiveMsg);
    }

    @StreamListener("input2")
    public void receiveInput2(String receiveMsg) {
        System.out.println("input2 receive: " + receiveMsg);
    }

    @StreamListener("input3")
    public void receiveInput3(@Payload Foo foo) {
        System.out.println("input3 receive: " + foo);
    }
}