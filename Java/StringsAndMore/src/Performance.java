import java.time.Clock;
import java.util.Arrays;

public class Performance {
    public static void main(String[] args) {
        String series = "";

        Clock clock = Clock.systemDefaultZone();
        long systemClockTicks = clock.millis();

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.println(ch);
            series += ch;
        }
        long nextClockTicks = clock.millis();
        System.out.println(series);
        System.out.println(nextClockTicks - systemClockTicks);
        System.out.println(Arrays.toString(series.split("")));
    }
}
