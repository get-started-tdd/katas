package test.com.getstartedtdd.katas;

import com.getstartedtdd.katas.Time;
import org.junit.Test;

import static com.getstartedtdd.katas.Time.at;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-8.
 */
public class TimeTest {

    @Test
    public void timeContainingSecondsOnly() throws Exception {
        assertThat(at("17").seconds(), equalTo(17));
        assertThat(at("20").seconds(), equalTo(20));
    }

    @Test
    public void timeMissingHours() throws Exception {
        assertThat(at("00:17").seconds(), equalTo(17));
        assertThat(at("22:17").seconds(), equalTo(22 * 60 + 17));
    }

    @Test
    public void fullyTimeFormat_HH_mm_ss() throws Exception {
        assertThat(at("13:22:17").seconds(), equalTo(13 * 60 * 60 + 22 * 60 + 17));
    }
}
