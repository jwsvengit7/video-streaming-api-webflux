package com.videoapi.webfluxvideoapi.utils;

public class Format {
    private static final String FORMAT = "classpath:videos/%s.mp4";
    public static String getFormat(){
       return FORMAT;
    }
}
