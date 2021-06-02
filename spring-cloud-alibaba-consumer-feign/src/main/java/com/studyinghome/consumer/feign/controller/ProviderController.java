package com.studyinghome.consumer.feign.controller;

import com.studyinghome.consumer.feign.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mirror
 */
@RestController
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/query")
    public String query() {
        return providerService.query();
    }
}
