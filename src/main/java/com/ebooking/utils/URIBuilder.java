package com.ebooking.utils;

import org.springframework.beans.factory.annotation.Autowired;

import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class URIBuilder extends org.apache.http.client.utils.URIBuilder {

    @Autowired
    private SimpleDateFormat dateFormat;

    public URIBuilder(String string) throws URISyntaxException {
        super(string);
    }

    public <T> URIBuilder addParam(String param, T value) {

        if (value == null)
            return this;
        if (value instanceof LocalDate)
            super.addParameter(param, dateFormat.format(value));
        else
            super.addParameter(param, String.valueOf(value));
        return this;
    }

}
