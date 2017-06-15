
package com.model;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfferDateRange {

    private LocalDate travelStartDate;
    private LocalDate travelEndDate;
    private long lengthOfStay;

    public LocalDate getTravelStartDate() {
        return travelStartDate;
    }

    @JsonSetter
    public void setTravelStartDate(List<Long> travelStartDate) {
        this.travelStartDate = LocalDate.of(travelStartDate.get(0).intValue(), travelStartDate.get(1).intValue()
                , travelStartDate.get(2).intValue());
    }

    public LocalDate getTravelEndDate() {
        return travelEndDate;
    }

    @JsonSetter
    public void setTravelEndDate(List<Long> travelEndDate) {
        this.travelEndDate = LocalDate.of(travelEndDate.get(0).intValue(), travelEndDate.get(1).intValue()
                , travelEndDate.get(2).intValue());

    }

    public long getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(long lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

}
