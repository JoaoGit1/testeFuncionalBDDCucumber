package Utils;

import java.time.Duration;

public class Utils {
    static final Duration duration = Duration.ofSeconds(10);

    public static Duration getMaxWaitTime() {
        return duration;
    }
}
