package com.kuniwake.vtraker.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public abstract class MainServiceConfig {
    @Value("${base.url}")
    protected String baseUrl;
    @Value("${api.key}")
    protected String apiKey;

    protected RestTemplate getRestTemplate(){
        RestTemplate restTemplate;
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        return restTemplate;
    }

}
