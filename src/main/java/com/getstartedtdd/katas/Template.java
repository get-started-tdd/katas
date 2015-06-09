package com.getstartedtdd.katas;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.quote;

/**
 * Created by L.x on 15-6-10.
 */
public class Template {
    private String template;

    public Template(String template) {
        this.template = template;
    }

    public String eval(Map<String, Object> context) {
        Pattern pattern = Pattern.compile(quote(Variable.EXPRESSION_START) + ".*?" + quote(Variable.EXPRESSION_END));
        Matcher matcher = pattern.matcher(template);
        StringBuilder result = new StringBuilder();
        int pos = 0;
        while (matcher.find()) {
            String expression = matcher.group();
            Literal literal = new Literal(template.substring(pos, matcher.start()));
            result.append(literal.eval(context))
                    .append(new Variable(expression).eval(context));
            pos = matcher.end();
        }
        Literal literal = new Literal(template.substring(pos));
        result.append(literal.eval(context));
        return result.toString();
    }

}
