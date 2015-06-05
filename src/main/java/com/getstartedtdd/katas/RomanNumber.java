package com.getstartedtdd.katas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by L.x on 15-6-5.
 */
public class RomanNumber {
    private int number;

    public RomanNumber(int number) {
        this.number = number;
    }

    private static final Map<Integer, String> conventions = new LinkedHashMap<Integer, String>() {{
        put(4, "IV");
        put(1, "I");
    }};

    @Override
    public String toString() {
        int number = this.number;
        String result = "";

        for (Integer value : conventions.keySet()) {
            String roman = conventions.get(value);
            while (number >= value) {
                result += roman;
                number -= value;
            }
        }
        return result;
    }
}
