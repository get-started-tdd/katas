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
        StringBuilder result = new StringBuilder();
        if (matcher.find()) {
            String name = matcher.group(1);
            String left = template.substring(0, matcher.start());
            String right = template.substring(matcher.end());
            result.append(left);
            if (context.containsKey(name)) {
                result.append(String.valueOf(context.get(name))).append(right);
            } else {
                result.append(matcher.group()).append(right);
            }
        } else {
            result.append(template);
        }
        return result.toString();
    }
}
