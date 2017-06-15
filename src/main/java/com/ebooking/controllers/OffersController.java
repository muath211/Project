package com.ebooking.controllers;

import com.ebooking.dto.SearchAttributes;
import com.ebooking.model.OffersGroup;
import com.ebooking.services.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {


    @Autowired
    private OffersService offersService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("searchAttributes", new SearchAttributes());
        return "index";
    }

    @RequestMapping(value = "/offers", method = RequestMethod.POST)
    public ModelAndView offers(@ModelAttribute SearchAttributes searchAttributes) {
        ModelAndView modelAndView;
        try {
            OffersGroup deals = offersService.fetchOffers(searchAttributes);
            modelAndView = new ModelAndView("offers");
            modelAndView.addObject("deals", deals);
        } catch (Exception e) {
            // should be logged
            modelAndView = new ModelAndView("error");
        }
        return modelAndView;
    }


}
