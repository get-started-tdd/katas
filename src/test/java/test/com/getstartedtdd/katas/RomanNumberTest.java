package test.com.getstartedtdd.katas;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-5.
 */
public class RomanNumberTest {

    @Test
    public void roman_number_does_not_have_0() throws Exception {
        assertThat(new RomanNumber(0).toString(), is(""));
    }
}
