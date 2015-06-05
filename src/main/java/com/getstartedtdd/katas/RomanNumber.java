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
        for (Convention convention : Convention.values()) {
            while (number >= convention.value) {
                result += convention.name();
                number -= convention.value;
            }
        }
        return result;
    }

    private static enum Convention {
        IV(4),
        I(1);
        private int value;

        Convention(int value) {
            this.value = value;
        }


    }
}
