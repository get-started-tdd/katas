package com.getstartedtdd.katas;

/**
 * Created by L.x on 15-6-5.
 */
public class Sum {
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
