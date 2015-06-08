package test.com.getstartedtdd.katas;

import com.getstartedtdd.katas.Time;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-8.
 */
public class TimeTest {

    @Test
    public void timeContainingSecondsOnly() throws Exception {
        assertThat(new Time("17").seconds(), equalTo(17));
        assertThat(new Time("20").seconds(), equalTo(20));
    }

    @Test
    public void timeMissingHours() throws Exception {
        assertThat(new Time("00:17").seconds(), equalTo(17));
        assertThat(new Time("22:17").seconds(), equalTo(22 * 60 + 17));
    }
}
