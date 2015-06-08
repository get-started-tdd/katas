package test.com.getstartedtdd.katas;

import com.getstartedtdd.katas.Time;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-6-8.
 */
public class TimeTest {

    @Test
    public void containingSecondsOnly() throws Exception {
        assertThat(new Time("17").seconds(), equalTo(17));
    }
}
