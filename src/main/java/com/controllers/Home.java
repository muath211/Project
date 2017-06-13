package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class Home {

    @RequestMapping("/index")
    public String home() {
        return "index";
    }

    @RequestMapping("/offers")
    @ResponseBody
    public String offers() {
        RestTemplate restTemplate = new RestTemplate();
        String quote = restTemplate.getForObject("https://offersvc.expedia.com/offers/v2/getOffers" +
                "?scenario=deal-finder&page=foo&uid=foo&productType=Hotel", String.class);
        return quote;
    }

}
