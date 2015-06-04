package com.getstartedtdd.katas;

/**
 * Created by L.x on 15-6-5.
 */
public class Sum {
    public static int sum(int[] numbers) {
        int result = 0;
        int index = 0;
        while (numbers.length > index) {
            result += numbers[index];
            index++;
        }
        return result;
    }
}
