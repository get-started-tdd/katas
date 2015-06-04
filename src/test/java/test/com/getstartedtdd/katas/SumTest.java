package test.com.getstartedtdd.katas;

import org.junit.Test;

import static com.getstartedtdd.katas.Sum.sum;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-4.
 */
public class SumTest {
    @Test
    public void sumWithEmptyArrayReturns0() throws Exception {
        assertThat(sum(new int[0]), equalTo(0));
    }

    @Test
    public void sumWithArrayContainingSingleNumberReturnsTheNumber() throws Exception {
        assertThat(sum(new int[]{1}), equalTo(1));
        assertThat(sum(new int[]{2}), equalTo(2));
    }

}
