package com.getstartedtdd.katas;

/**
 * Created by L.x on 15-6-5.
 */
public class RomanNumber {
    private int number;

    public RomanNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (number == 1) {
            return "I";
        }
        return "";
    }
}
