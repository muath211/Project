package com.ebooking.configuration;

import com.ebooking.services.OffersService;
import com.ebooking.services.impl.OffersServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;

@Configuration
public class Beans {

    private static final String DATE_FORMAT = "yyyy-mm-dd";

    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat(DATE_FORMAT);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public OffersService offersService() {
        return new OffersServiceImpl();
    }

}
