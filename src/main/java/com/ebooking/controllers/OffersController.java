package com.ebooking.controllers;

import com.ebooking.dto.SearchAttributes;
import com.ebooking.model.OffersGroup;
import com.ebooking.model.RootObject;
import com.ebooking.services.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;

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

    @RequestMapping(value = "/show/event", method = RequestMethod.POST)
    public @ResponseBody
    RootObject event(/*@RequestBody RootObject rootObject, */HttpServletRequest httpRequest, @RequestParam  String token) throws IOException {
        System.out.println("request>>>>>>>" + httpRequest.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String body = getBody(httpRequest);
        System.out.println(body);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("============================================================================");
        Enumeration<String> headerNames = httpRequest.getHeaderNames();

        if (headerNames != null) {
            while (headerNames.hasMoreElements()) {
                String s = headerNames.nextElement();
                System.out.println("Header: " + s + " >> " + httpRequest.getHeader(s));
            }
        }

        System.out.println("============================================================================");

//        System.out.println(rootObject.getMessage().getData());
//        System.out.println(rootObject);
        return new RootObject();
    }

    @RequestMapping(value = "/show/googleaaf6a1bff784af77.html", method = RequestMethod.GET)
    public @ResponseBody
    String show() {
        return "google-site-verification: googleaaf6a1bff784af77.html";
    }

    public static String getBody(HttpServletRequest request) throws IOException {

        String body = null;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    throw ex;
                }
            }
        }

        body = stringBuilder.toString();
        return body;
    }


}
