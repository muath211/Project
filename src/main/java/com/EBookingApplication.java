package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
public class EBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(EBookingApplication.class, args);
    }

}
