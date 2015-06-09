package com.getstartedtdd.katas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * Created by L.x on 15-6-10.
 */
public class Template {
    private List<Node> nodeTree;

    public Template(String template) {
        nodeTree = compile(template);
    }

    private List<Node> compile(String template) {
        Matcher matcher = Variable.VARIABLE_PATTERN.matcher(template);
        List<Node> nodeTree = new ArrayList<Node>();
        int pos = 0;
        while (matcher.find()) {
            String expression = matcher.group();
            nodeTree.add(literal(template.substring(pos, matcher.start())));
            nodeTree.add(variable(expression));
            pos = matcher.end();
        }
        nodeTree.add(literal(template.substring(pos)));
        return nodeTree;
    }

    private Variable variable(String expression) {
        return new Variable(expression);
    }

    private Literal literal(String literal) {
        return new Literal(literal);
    }

    public String eval(Map<String, Object> context) {
        StringBuilder result = new StringBuilder();
        for (Node node : nodeTree) {
            result.append(node.eval(context));
        }
        return result.toString();
    }

}
