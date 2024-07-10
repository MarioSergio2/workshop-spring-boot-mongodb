package com.mariosergio.workshopmongo.resources.util;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class URL {

    public static String decodeParam(String text) {
        return URLDecoder.decode(text, StandardCharsets.UTF_8);
    }

    public static Date convertDate(String textDate, Date defaultValue) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(textDate);
        } catch (ParseException e) {
            return defaultValue;
        }
    }
}
