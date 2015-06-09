package com.getstartedtdd.katas;

import java.util.Map;

/**
 * Created by L.x on 15-6-10.
 */
public class Variable {
    private String token;

    public Variable(String token) {
        this.token = token;
    }

    public String eval(Map<String, Object> context) {
        return Template.evalVariable(token, context);
    }
}
