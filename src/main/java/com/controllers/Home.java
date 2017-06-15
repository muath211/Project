package com.controllers;

import com.dto.SearchAttributes;
import com.model.Example;
import com.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Controller
public class Home {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/index")
    public String home() {
        return "index";
    }

    @RequestMapping("/alloffers")
    public ModelAndView offers() {

        Example deals = restTemplate.getForObject("https://offersvc.expedia.com/offers/v2/getOffers" +
                "?scenario=deal-finder&page=foo&uid=foo&productType=Hotel", Example.class);

        ModelAndView modelAndView = new ModelAndView("offers");
        modelAndView.addObject("deals", deals);
        return modelAndView;
    }

    @RequestMapping("/offers")
    @ResponseBody
    public String offersFilterd(@Valid @ModelAttribute("searchAttributes")SearchAttributes search,
                                      BindingResult result) {
        try {
            URIBuilder uri = new URIBuilder("https://offersvc.expedia.com")
             .addParam("minTripStartDate",  search.getMinTripStartDate() )
             .addParam("maxTripStartDate",  search.getMaxTripStartDate())
             .addParam("lengthOfStay", search.getLengthOfStay())
             .addParam("minStarRating", search.getMinStarRating())
             .addParam("maxStarRating", search.getMaxStarRating())
             .addParam("destinationCity", search.getCity());

        return uri.build().toString();

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return "problem!!!!!!";
    }

    @RequestMapping("/test")
    public String test() {

        return "test" ;
    }

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-mm-dd");
    }

}
