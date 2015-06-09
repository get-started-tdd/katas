package test.com.getstartedtdd.katas;

import com.getstartedtdd.katas.Literal;
import com.getstartedtdd.katas.Variable;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-10.
 */
public class VariableTest {
    @Test
    public void evaluate() throws Exception {
        Map<String, Object> context = Collections.<String, Object>singletonMap("foo", "bar");
        assertThat(new Variable("${foo}").eval(context), equalTo("bar"));
    }

    @Test
    public void treatMissingVariableAsLiteral() throws Exception {
        Map<String, Object> context = Collections.emptyMap();
        assertThat(new Variable("${foo}").eval(context), equalTo("${foo}"));
    }
}
