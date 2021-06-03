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


    public void send(String msg) {
        try {
            senderService.send(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
