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
        return template.replace("${foo}", String.valueOf(context.get("foo")));
    }
}
