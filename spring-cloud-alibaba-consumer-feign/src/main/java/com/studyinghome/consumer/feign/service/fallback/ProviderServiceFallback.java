package com.studyinghome.consumer.feign.service.fallback;

import com.studyinghome.consumer.feign.service.ProviderService;
import org.springframework.stereotype.Component;


/**
 * 提供者服务回退
 *
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/02
 */
@Component
public class ProviderServiceFallback implements ProviderService {

    @Override
    public String query() {
        return "sentinel fallback";
    }
}
