package com.getstartedtdd.katas;

import java.util.Map;

/**
 * Created by L.x on 15-6-10.
 */
public class Variable {
    public static final String EXPRESSION_START = "${";
    public static final String EXPRESSION_END = "}";
    private String token;

    public Variable(String token) {
        this.token = token;
    }

    private static String nameOf(String expression) {
        return expression.substring(EXPRESSION_START.length(), expression.length() - EXPRESSION_END.length());
    }

    public String eval(Map<String, Object> context) {
        String name = nameOf(token);
        if (context.containsKey(name)) {
            return String.valueOf(context.get(name));
        } else {
            return token;
        }
    }
}
