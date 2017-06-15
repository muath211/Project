
package com.ebooking.model;

import java.util.ArrayList;
import java.util.List;

public class HotelUrgencyInfo {

    private long airAttachRemainingTime;
    private long numberOfPeopleViewing;
    private long numberOfPeopleBooked;
    private long numberOfRoomsLeft;
    private long lastBookedTime;
    private String almostSoldStatus;
    private String link;
    private List<Object> almostSoldOutRoomTypeInfoCollection = new ArrayList<Object>();
    private boolean airAttachEnabled;

    public long getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    public void setAirAttachRemainingTime(long airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    public long getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    public void setNumberOfPeopleViewing(long numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    public long getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    public void setNumberOfPeopleBooked(long numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    public long getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    public void setNumberOfRoomsLeft(long numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    public long getLastBookedTime() {
        return lastBookedTime;
    }

    public void setLastBookedTime(long lastBookedTime) {
        this.lastBookedTime = lastBookedTime;
    }

    public String getAlmostSoldStatus() {
        return almostSoldStatus;
    }

    public void setAlmostSoldStatus(String almostSoldStatus) {
        this.almostSoldStatus = almostSoldStatus;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Object> getAlmostSoldOutRoomTypeInfoCollection() {
        return almostSoldOutRoomTypeInfoCollection;
    }

    public void setAlmostSoldOutRoomTypeInfoCollection(List<Object> almostSoldOutRoomTypeInfoCollection) {
        this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
    }

    public boolean isAirAttachEnabled() {
        return airAttachEnabled;
    }

    public void setAirAttachEnabled(boolean airAttachEnabled) {
        this.airAttachEnabled = airAttachEnabled;
    }

}
