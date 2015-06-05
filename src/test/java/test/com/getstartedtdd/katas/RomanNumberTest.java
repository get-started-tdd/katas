package test.com.getstartedtdd.katas;

import com.getstartedtdd.katas.RomanNumber;
import org.junit.Ignore;
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

    @Test
    public void convert_1_to_I() throws Exception {
        assertThat(new RomanNumber(1).toString(), is("I"));
    }

    @Test
    public void convert_2_to_II() throws Exception {
        assertThat(new RomanNumber(2).toString(), is("II"));
    }

    @Test
    public void can_convert_number_to_roman_many_times() throws Exception {
        RomanNumber number = new RomanNumber(2);
        assertThat(number.toString(), is("II"));
        assertThat(number.toString(), is("II"));
    }
}
