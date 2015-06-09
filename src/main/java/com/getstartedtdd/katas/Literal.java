package com.getstartedtdd.katas;

import java.util.Map;

/**
 * Created by L.x on 15-6-10.
 */
public class Literal {
    private String text;

    public Literal(String text) {
        this.text = text;
    }

    public String eval(Map<String, Object> context) {
        return text;
    }

}
