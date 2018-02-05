package com.ebooking.model;

public class Message
{
    private Attributes attributes;

    public Attributes getAttributes() { return this.attributes; }

    public void setAttributes(Attributes attributes) { this.attributes = attributes; }

    private String data;

    public String getData() { return this.data; }

    public void setData(String data) { this.data = data; }

    private String message_id;

    public String getMessageId() { return this.message_id; }

    public void setMessageId(String message_id) { this.message_id = message_id; }
}
