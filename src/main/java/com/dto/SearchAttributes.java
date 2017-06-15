package com.dto;


import java.time.LocalDate;

public class SearchAttributes {
    private String city;
    private LocalDate minTripStartDate;
    private LocalDate maxTripStartDate;
    private long lengthOfStay;
    private short minStarRating;
    private short maxStarRating;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getMinTripStartDate() {
        return minTripStartDate;
    }

    public void setMinTripStartDate(LocalDate minTripStartDate) {
        this.minTripStartDate = minTripStartDate;
    }

    public LocalDate getMaxTripStartDate() {
        return maxTripStartDate;
    }

    public void setMaxTripStartDate(LocalDate maxTripStartDate) {
        this.maxTripStartDate = maxTripStartDate;
    }

    public long getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(long lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public short getMinStarRating() {
        return minStarRating;
    }

    public void setMinStarRating(short minStarRating) {
        this.minStarRating = minStarRating;
    }

    public short getMaxStarRating() {
        return maxStarRating;
    }

    public void setMaxStarRating(short maxStarRating) {
        this.maxStarRating = maxStarRating;
    }
}
