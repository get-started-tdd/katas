package com.getstartedtdd.katas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * Created by L.x on 15-6-10.
 */
public class Template {
    private String template;

    public Template(String template) {
        this.template = template;
    }

    public String eval(Map<String, Object> context) {
        Matcher matcher = Variable.VARIABLE_PATTERN.matcher(template);
        List<Node> nodeTree = new ArrayList<Node>();
        int pos = 0;
        while (matcher.find()) {
            String expression = matcher.group();
            Literal literal = new Literal(template.substring(pos, matcher.start()));
            Variable variable = new Variable(expression);
            nodeTree.add(literal);
            nodeTree.add(variable);
            pos = matcher.end();
        }
        Literal literal = new Literal(template.substring(pos));
        nodeTree.add(literal);

        StringBuilder result = new StringBuilder();
        for (Node node : nodeTree) {
            result.append(node.eval(context));
        }
        return result.toString();
    }

}
