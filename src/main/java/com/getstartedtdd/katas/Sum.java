package com.getstartedtdd.katas;

/**
 * Created by L.x on 15-6-5.
 */
public class Sum {
    public static int sum(int[] numbers) {
        int result = 0;
        if (numbers.length > 0) {
            result += numbers[0];
        }
        return result;
    }
}
