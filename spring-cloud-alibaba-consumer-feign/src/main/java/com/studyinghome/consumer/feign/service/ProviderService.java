package com.studyinghome.consumer.feign.service;

import com.studyinghome.consumer.feign.service.fallback.ProviderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * 提供者服务
 *
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/02
 */
@FeignClient(value = "provider", fallback = ProviderServiceFallback.class)
public interface ProviderService {

    /**
     * 查询
     *
     * @return {@link String}
     */
    @GetMapping(value = "/query")
    String query();
}