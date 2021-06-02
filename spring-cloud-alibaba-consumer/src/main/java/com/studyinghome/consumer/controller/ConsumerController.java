package com.studyinghome.consumer.controller;

import com.alibaba.fastjson.JSON;
import com.studyinghome.consumer.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 消费者控制器
 *
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/02
 */
@RestController
public class ConsumerController {

    @GetMapping(value = "/query")
    public String query() {
        User user = new User();
        user.setUsername("leslie");
        user.setPassword("123456");
        return JSON.toJSONString(user);
    }
}