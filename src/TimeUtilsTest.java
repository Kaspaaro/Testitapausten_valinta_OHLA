import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
class TimeUtilsTest {
    @ParameterizedTest
    @CsvSource({
            "0, 0:00:00",
            "1, 0:00:01",
            "59, 0:00:59",
            "60, 0:01:00",
            "3600, 1:00:00",
            "3665, 1:01:05",
            "86399, 23:59:59",
            "86400, 24:00:00",
            "32000, 8:53:20",
            "-1, -1"
    })
    void testSecToTime(int seconds, String expectedTime) {
        assertEquals(expectedTime, TimeUtils.secToTime(seconds));
    }

    @ParameterizedTest
    @CsvSource({
            "0:00:00, 0",
            "0:00:01, 1",
            "0:00:59, 59",
            "0:01:00, 60",
            "1:00:00, 3600",
            "1:01:05, 3665",
            "23:59:59, 86399",
            "24:00:00, 86400",
            ", -1",
    })
    void testTimeToSec(String time, int expectedSeconds) {
        assertEquals(expectedSeconds, TimeUtils.timeToSec(time));
    }
}