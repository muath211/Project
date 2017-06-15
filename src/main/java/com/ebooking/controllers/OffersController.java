package com.ebooking.controllers;

import com.ebooking.dto.SearchAttributes;
import com.ebooking.utils.URIBuilder;
import com.ebooking.model.OffersObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.net.URISyntaxException;

@Controller
public class OffersController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/index")
    public String home(Model model) {
        model.addAttribute("searchAttributes", new SearchAttributes());
        return "index";
    }

    @RequestMapping(value = "/offers", method = RequestMethod.POST)
    public ModelAndView offers(@ModelAttribute SearchAttributes searchAttributes) {
        ModelAndView modelAndView;
        try {
            URIBuilder uri = buildRequest(searchAttributes);
            OffersObject deals = restTemplate.getForObject(uri.build().toString(), OffersObject.class);
            modelAndView = new ModelAndView("offers");
            modelAndView.addObject("deals", deals);
        } catch (URISyntaxException e) {
            // should be logged
            modelAndView = new ModelAndView("error");
        }
        return modelAndView;
    }

    private URIBuilder buildRequest(@ModelAttribute SearchAttributes searchAttributes) throws URISyntaxException {
        return new URIBuilder("https://offersvc.expedia.com/offers/v2/getOffers")
                .addParam("minTripStartDate", searchAttributes.getMinTripStartDate())
                .addParam("maxTripStartDate", searchAttributes.getMaxTripStartDate())
                .addParam("lengthOfStay", searchAttributes.getLengthOfStay())
                .addParam("minStarRating", searchAttributes.getMinStarRating())
                .addParam("maxStarRating", searchAttributes.getMaxStarRating())
                .addParam("destinationCity", searchAttributes.getDestinationCity())
                .addParam("scenario", "deal-finder")
                .addParam("page", "foo")
                .addParam("uid", "foo")
                .addParam("productType", "Hotel");
    }

}
