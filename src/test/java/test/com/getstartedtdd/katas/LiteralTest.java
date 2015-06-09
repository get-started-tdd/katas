package test.com.getstartedtdd.katas;

import com.getstartedtdd.katas.Literal;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-10.
 */
public class LiteralTest {
    private static final Map<String, Object> CONTEXT_UNUSED = null;

    @Test
    public void evaluate() throws Exception {
        assertThat(new Literal("text").eval(CONTEXT_UNUSED),equalTo("text"));
    }
}
