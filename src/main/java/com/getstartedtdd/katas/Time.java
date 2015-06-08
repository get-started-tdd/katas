package com.getstartedtdd.katas;


/**
 * Created by L.x on 15-6-8.
 */
public class Time {
    public static final int A_MINUTE = 60;
    private String time;

    public Time(String time) {
        this.time = time;
    }

    public static Time at(String time) {
        return new Time(time);
    }

    public int seconds() {
        int seconds = 0;
        for (String part : parts()) {
            seconds = seconds * A_MINUTE + Integer.parseInt(part);
        }
        return seconds;
    }

    private String[] parts() {
        return time.split(":");
    }
}