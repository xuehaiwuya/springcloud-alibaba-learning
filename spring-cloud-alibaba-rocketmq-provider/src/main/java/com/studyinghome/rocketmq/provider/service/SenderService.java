package com.studyinghome.rocketmq.provider.service;

import org.apache.rocketmq.common.message.MessageConst;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 发送方服务
 *
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/03
 */
@Service
public class SenderService {
    @Autowired
    private MySource source;

    public void send(String msg) {
        source.output1().send(MessageBuilder.withPayload(msg).build());
    }

    public <T> void sendTimeout(T msg, Long timeout, String tag) {
        Message<T> message = MessageBuilder.createMessage(msg,
                new MessageHeaders(Stream.of(tag)
                        .collect(Collectors.toMap(str -> MessageConst.PROPERTY_TAGS, String::toString))));
        source.output1().send(message, timeout);
    }

    public void sendWithTags(String msg, String tag) {
        Message<String> message = MessageBuilder.withPayload(msg)
                .setHeader(RocketMQHeaders.TAGS, tag)
                .build();
        source.output1().send(message);
    }

    public <T> void sendObject(T msg, String tag) {
        Message<T> message = MessageBuilder.withPayload(msg)
                .setHeader(RocketMQHeaders.TAGS, tag)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build();
        source.output2().send(message);
    }

    public <T> void sendTransactionalMsg(T msg, int num) {
        MessageBuilder<T> builder = MessageBuilder.withPayload(msg)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON);
        builder.setHeader("test", String.valueOf(num));
        builder.setHeader(RocketMQHeaders.TAGS, "binder");
        Message message = builder.build();
        source.output2().send(message);
    }
}