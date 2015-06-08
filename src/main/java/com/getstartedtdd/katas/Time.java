package com.getstartedtdd.katas;


/**
 * Created by L.x on 15-6-8.
 */
public class Time {
    private String time;

    public Time(String time) {
        this.time = time;
    }

    public int seconds() {
        String[] parts = time.split(":");
        int seconds = 0;
        int index = 0;
        while (index < parts.length) {
            seconds *= 60;
            seconds += Integer.parseInt(parts[index]);
            index++;
        }
        return seconds;
    }
}