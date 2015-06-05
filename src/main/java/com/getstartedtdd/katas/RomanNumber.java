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
        int number = this.number;
        String result = "";
        while (number >= 4) {
            result += "IV";
            number -= 4;
        }
        while (number >= 1) {
            result += "I";
            number -= 1;
        }
        return result;
    }
}
