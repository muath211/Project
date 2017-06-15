
package com.ebooking.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.List;

public class Offers {

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<Hotel> Hotel = new ArrayList<Hotel>();

    public List<Hotel> getHotel() {
        return Hotel;
    }

    public void setHotel(List<Hotel> Hotel) {
        this.Hotel = Hotel;
    }

}
