package com.ebooking.services.impl;

import com.ebooking.dto.SearchAttributes;
import com.ebooking.model.OffersGroup;
import com.ebooking.services.OffersService;
import com.ebooking.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

public class OffersServiceImpl implements OffersService {

    private static final String URL = "https://url.com";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public OffersGroup fetchOffers(SearchAttributes searchAttributes) {
        try {
            URIBuilder uri = buildRequest(searchAttributes);
            return restTemplate.getForObject(uri.build().toString(), OffersGroup.class);

        } catch (URISyntaxException e) {
            // should be logged
            return null;
        }
    }

    private URIBuilder buildRequest(@ModelAttribute SearchAttributes searchAttributes) throws URISyntaxException {
        return new URIBuilder(URL)
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
