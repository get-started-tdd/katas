package com.getstartedtdd.katas;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.quote;

/**
 * Created by L.x on 15-6-10.
 */
public class Template {
    public static final String EXPRESSION_START = "${";
    public static final String EXPRESSION_END = "}";
    private String template;

    public Template(String template) {
        this.template = template;
    }

    public String eval(Map<String, Object> context) {
        Pattern pattern = Pattern.compile(quote(EXPRESSION_START) + ".*?" + quote(EXPRESSION_END));
        Matcher matcher = pattern.matcher(template);
        StringBuilder result = new StringBuilder();
        int pos = 0;
        while (matcher.find()) {
            String expression = matcher.group();
            result.append(template.substring(pos, matcher.start()))
                    .append(evalVariable(expression, context));
            pos = matcher.end();
        }
        result.append(template.substring(pos));
        return result.toString();
    }

    private String evalVariable(String expression, Map<String, Object> context) {
        String name = nameOf(expression);
        if (context.containsKey(name)) {
            return String.valueOf(context.get(name));
        } else {
            return expression;
        }
    }

    private String nameOf(String expression) {
        return expression.substring(EXPRESSION_START.length(), expression.length() - EXPRESSION_END.length());
    }
}
