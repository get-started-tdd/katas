package com.getstartedtdd.katas;

/**
 * Created by L.x on 15-6-5.
 */
public class Sum {
    public static int sum(int[] numbers) {
        int result = 0;
        int index = 0;
        if (numbers.length > index) {
            result += numbers[index];
        }
        return result;
    }
}
