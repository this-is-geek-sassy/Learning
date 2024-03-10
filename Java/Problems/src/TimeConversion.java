import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour, minute, second;
        String morningEvening;
        System.out.println("Please enter the time in 12 hour format, " +
                "separated by space and ending with \"AM\" or \"PM\" ");
        hour = scanner.nextInt();
        minute = scanner.nextInt();
        second = scanner.nextInt();
        morningEvening = scanner.next();
        System.out.println(hour + " " + minute + " " + second + " " + morningEvening);
        if (!check(hour, minute, second, morningEvening)) {
            System.out.println("Bad input");
            return;
        }
        if (morningEvening.toLowerCase().equals("pm") && hour != 12) {
            hour += 12;
        }
        System.out.println(hour + " " + minute + " " + second);
    }

    public static boolean check(int hour, int minute, int second, String morningEvening) {
        if (hour > 12 || minute >= 60 || second >= 60 ||
                !(morningEvening.equals("AM") || morningEvening.equals("PM"))) {
            return false;
        }
        return true;
    }
}
