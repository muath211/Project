package com.ebooking.dto;


import java.time.LocalDate;

public class SearchAttributes {
    private String destinationCity;
    private LocalDate minTripStartDate;
    private LocalDate maxTripStartDate;
    private Long lengthOfStay;
    private Short minStarRating;
    private Short maxStarRating;

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
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

    public Long getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Long lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public Short getMinStarRating() {
        return minStarRating;
    }

    public void setMinStarRating(Short minStarRating) {
        this.minStarRating = minStarRating;
    }

    public Short getMaxStarRating() {
        return maxStarRating;
    }

    public void setMaxStarRating(Short maxStarRating) {
        this.maxStarRating = maxStarRating;
    }


}
