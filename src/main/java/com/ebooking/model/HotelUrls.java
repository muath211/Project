
package com.ebooking.model;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class HotelUrls {

    private String hotelInfositeUrl;
    private String hotelSearchResultUrl;

    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    public String getDecodedHotelInfositeUrl() {
        try {
            return URLDecoder.decode(hotelInfositeUrl, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            // should be logged
        }
        return null;
    }

    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

}
