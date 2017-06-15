package com.ebooking.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;

@Configuration
public class Beans {
    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyyy-mm-dd");
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
