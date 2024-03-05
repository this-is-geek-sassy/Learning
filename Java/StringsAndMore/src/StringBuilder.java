import java.time.Clock;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();

        Clock clock = Clock.systemDefaultZone();
        long systemClockTicks = clock.millis();

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.println(ch);
            builder.append(ch);
        }
        long nextClockTicks = clock.millis();
        System.out.println(builder);
        System.out.println(nextClockTicks - systemClockTicks);
    }
}
