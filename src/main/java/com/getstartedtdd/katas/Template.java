package com.getstartedtdd.katas;

import java.util.Map;

/**
 * Created by L.x on 15-6-10.
 */
public class Template {
    private String template;

    public Template(String template) {
        this.template = template;
    }

    public String eval(Map<String, Object> context) {
        for (String name : context.keySet()) {
            template = template.replace("${" + name + "}", String.valueOf(context.get(name)));
        }
        return template;
    }
}
