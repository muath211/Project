package com.ebooking.services;

import com.ebooking.dto.SearchAttributes;
import com.ebooking.model.OffersGroup;

public interface OffersService {

    OffersGroup fetchOffers(SearchAttributes  searchAttributes);

}
