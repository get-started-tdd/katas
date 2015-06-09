package com.getstartedtdd.katas;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by L.x on 15-6-10.
 */
public class Template {
    private String template;

    public Template(String template) {
        this.template = template;
    }

    public String eval(Map<String, Object> context) {
        Pattern pattern = Pattern.compile("\\$\\{(.*)\\}");
        Matcher matcher = pattern.matcher(template);
        if (matcher.find()) {
            String name = matcher.group(1);
            if (context.containsKey(name)) {
                return template.substring(0, matcher.start()) + String.valueOf(context.get(name));
            } else {
                return matcher.group();
            }
        }
        return template;
    }
}
