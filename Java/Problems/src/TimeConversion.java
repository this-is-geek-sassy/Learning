import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flag;
        do {
            System.out.println("Enter 1 to convert 12 hour format to 24 hour format" +
                    "\nAnd 2 to convert from 24 hour format to 12 hour format");
            flag = scanner.nextInt();
        } while (flag != 1 && flag!=2);

        if (flag == 1) {
            _12to24hoursConverter(scanner);
        } else {
            _24to12hoursConverter(scanner);
        }
    }

    public static boolean check12hourFormat(int hour, int minute, int second, String morningEvening) {
        if (!(hour > 0 && minute > 0 && second > 0))
            return false;
        if (hour > 12 || minute >= 60 || second >= 60 ||
                !(morningEvening.toLowerCase().equals("am") || morningEvening.toUpperCase().equals("PM"))) {
            return false;
        }
        return true;
    }
    public static boolean check24hourFormat(int hour, int minute, int second) {
        if (!(hour > 0 && minute > 0 && second > 0))
            return false;
        if (hour > 23 || minute >= 60 || second >= 60) {
            return false;
        }
        return true;
    }
    public static void _12to24hoursConverter (Scanner scanner) {
        int hour, minute, second;
        String morningEvening;

        System.out.println("Please enter the time in 12 hour format, " +
                "separated by space and ending with \"AM\" or \"PM\" ");
        hour = scanner.nextInt();
        minute = scanner.nextInt();
        second = scanner.nextInt();
        morningEvening = scanner.next();
        System.out.println(hour + " " + minute + " " + second + " " + morningEvening);
        if (!check12hourFormat(hour, minute, second, morningEvening)) {
            System.out.println("Bad input");
            return;
        }
        if (morningEvening.toLowerCase().equals("pm") && hour != 12) {
            hour += 12;
        }
        System.out.println(hour + " " + minute + " " + second);
    }
    public static void _24to12hoursConverter (Scanner scanner) {
        int hour, minute, second;
        String morningEvening;

        System.out.println("Please enter the time in 24 hour format: ");
        hour = scanner.nextInt();
        minute = scanner.nextInt();
        second = scanner.nextInt();
        System.out.println(hour + " " + minute + " " + second);

        if (!check24hourFormat(hour, minute, second)) {
            System.out.println("Bad input");
            return;
        }
        if (hour >=13 && hour <= 23) {
            hour -= 12;
            morningEvening = "PM";
        } else if (hour == 12) {
            morningEvening = "PM";
        } else if (hour == 0) {
            hour = 12;
            morningEvening = "AM";
        } else {
            morningEvening = "AM";
        }
        System.out.println(hour + " " + minute + " " + second + " " + morningEvening);
    }
}
