
package com.model;

import java.util.ArrayList;
import java.util.List;

public class OfferDateRange {

    private List<Long> travelStartDate = new ArrayList<Long>();
    private List<Long> travelEndDate = new ArrayList<Long>();
    private long lengthOfStay;

    public List<Long> getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(List<Long> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public List<Long> getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(List<Long> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public long getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(long lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

}
