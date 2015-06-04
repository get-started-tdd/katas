package test.com.getstartedtdd.katas;

import org.hamcrest.Matcher;
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
        assertThat(sum(with(emptyArray())), returns(0));
    }

    @Test
    public void sumWithArrayContainingSingleNumberReturnsTheNumber() throws Exception {
        assertThat(sum(with(1)), returns(1));
        assertThat(sum(with(2)), returns(2));
    }

    @Test
    public void sumAllTheNumbersInArray() throws Exception {
        assertThat(sum(with(1, 2)), returns(3));
    }

    private int[] with(int... numbers) {
        return numbers;
    }

    private int[] emptyArray() {
        return new int[0];
    }

    private Matcher<Integer> returns(int result) {
        return equalTo(result);
    }

}
