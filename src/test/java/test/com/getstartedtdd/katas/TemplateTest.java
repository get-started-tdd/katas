package test.com.getstartedtdd.katas;

import com.getstartedtdd.katas.Template;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-10.
 */
public class TemplateTest {
    @Test
    public void plainText() throws Exception {
        Map<String, Object> context = new HashMap<String, Object>();
        assertThat(new Template("text").eval(context), equalTo("text"));
    }

    @Test
    public void expression() throws Exception {
        Map<String, Object> context = new HashMap<String, Object>();
        context.put("foo", "bar");
        assertThat(new Template("${foo}").eval(context), equalTo("bar"));
    }

    @Test
    public void expression2() throws Exception {
        Map<String, Object> context = new HashMap<String, Object>();
        context.put("key", "value");
        assertThat(new Template("${key}").eval(context), equalTo("value"));
    }
}
