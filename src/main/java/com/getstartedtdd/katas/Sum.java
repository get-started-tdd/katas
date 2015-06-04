package com.getstartedtdd.katas;

/**
 * Created by L.x on 15-6-5.
 */
public class Sum {
    public static int sum(int[] numbers) {
        int result = 0;
        for (int index = 0; numbers.length > index; index++) {
            result += numbers[index];
        }
        return result;
    }
}
