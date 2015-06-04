package test.com.getstartedtdd.katas;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-4.
 */
public class SumTest {
    @Test
    public void sumWithEmptyArrayReturns0() throws Exception {
        assertThat(Sum.sum(new int[0]), equalTo(0));
    }

}
