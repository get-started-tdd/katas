package test.com.getstartedtdd.katas;

import com.getstartedtdd.katas.RomanNumber;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-5.
 */
public class RomanNumberTest {

    @Test
    public void roman_number_does_not_have_0() throws Exception {
        assertThat(toRomanNumberString(0), is(""));
    }

    @Test
    public void convert_arabic_number_to_roman_number() throws Exception {
        assertThat(toRomanNumberString(1), is("I"));
        assertThat(toRomanNumberString(2), is("II"));
        assertThat(toRomanNumberString(3), is("III"));
        assertThat(toRomanNumberString(4), is("IV"));
        assertThat(toRomanNumberString(5), is("V"));
        assertThat(toRomanNumberString(7), is("VII"));
        assertThat(toRomanNumberString(9), is("IX"));
        assertThat(toRomanNumberString(10), is("X"));
        assertThat(toRomanNumberString(40), is("XL"));
        assertThat(toRomanNumberString(50), is("L"));
        assertThat(toRomanNumberString(90), is("XC"));
        assertThat(toRomanNumberString(100), is("C"));
        assertThat(toRomanNumberString(400), is("CD"));
        assertThat(toRomanNumberString(500), is("D"));
        assertThat(toRomanNumberString(900), is("CM"));
        assertThat(toRomanNumberString(1000), is("M"));
        assertThat(toRomanNumberString(2659), is("MMDCLIX"));
    }

    @Test
    public void can_convert_number_to_roman_many_times() throws Exception {
        RomanNumber number = new RomanNumber(2);
        assertThat(number.toString(), is("II"));
        assertThat(number.toString(), is("II"));
    }

    private String toRomanNumberString(int number) {
        return new RomanNumber(number).toString();
    }
}
