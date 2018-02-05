package com.ebooking.model;

public class RootObject
{
    private Message message;

    public Message getMessage() { return this.message; }

    public void setMessage(Message message) { this.message = message; }

    private String subscription;

    public String getSubscription() { return this.subscription; }

    public void setSubscription(String subscription) { this.subscription = subscription; }
}
