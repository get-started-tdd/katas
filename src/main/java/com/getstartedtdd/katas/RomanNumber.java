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
        M(1000), CM(900), D(500), CD(400), C(100),
        XC(90), L(50), XL(40), X(10),
        IX(9), V(5), IV(4), I(1);

        private int value;

        Convention(int value) {
            this.value = value;
        }


    }
}
