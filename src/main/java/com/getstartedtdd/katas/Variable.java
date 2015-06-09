package com.getstartedtdd.katas;

import java.util.Map;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.quote;

/**
 * Created by L.x on 15-6-10.
 */
public class Variable {
    public static final String EXPRESSION_START = "${";
    public static final String EXPRESSION_END = "}";
    public static final Pattern VARIABLE_PATTERN = Pattern.compile(quote(EXPRESSION_START) + ".*?" + quote(EXPRESSION_END));
    private String token;
    private String name;

    public Variable(String token) {
        this.token = token;
        name = nameOf(token);
    }

    private static String nameOf(String expression) {
        return expression.substring(EXPRESSION_START.length(), expression.length() - EXPRESSION_END.length());
    }

    public String eval(Map<String, Object> context) {
        if (context.containsKey(name)) {
            return String.valueOf(context.get(name));
        } else {
            return token;
        }
    }
}
