package test.com.getstartedtdd.katas;

import com.getstartedtdd.katas.Template;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-10.
 */
public class TemplateTest {

    private Map<String, Object> context;

    @Before
    public void setUp() throws Exception {
        context = new LinkedHashMap<String, Object>();
    }

    @Test
    public void plainText() throws Exception {
        assertEvalTemplate("text", equalTo("text"));
    }

    @Test
    public void expression() throws Exception {
        set("foo", "bar");
        assertEvalTemplate("${foo}", equalTo("bar"));
    }

    @Test
    public void expression2() throws Exception {
        set("key", "value");
        assertEvalTemplate("${key}", equalTo("value"));
    }

    @Test
    public void printExpressionAsLiteralIfVariableMissing() throws Exception {
        assertEvalTemplate("${missing}", equalTo("${missing}"));
    }

    @Test
    @Ignore
    public void stopProcessingExpressionIfAfterEvaluated() throws Exception {
        set("foo", "${bar}");
        set("bar", "bar");
        assertEvalTemplate("${foo} is ${bar}", equalTo("${bar} is bar"));
    }

    private void assertEvalTemplate(String template, Matcher<String> matcher) {
        assertThat(new Template(template).eval(context), matcher);
    }

    private void set(String name, Object value) {
        context.put(name, value);
    }
}
