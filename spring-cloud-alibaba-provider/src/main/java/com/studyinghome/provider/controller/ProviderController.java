package com.studyinghome.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 提供控制器
 *
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/03
 */
@RestController
public class ProviderController {

    @GetMapping(value = "/query")
    public String query(String message) {
        return message;
    }
}