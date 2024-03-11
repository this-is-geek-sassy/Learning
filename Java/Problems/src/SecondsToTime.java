import java.util.Scanner;

public class SecondsToTime {
    public static void main(String[] args) {
        int seconds;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of seconds: ");
        seconds = s.nextInt();
        int hours, minutes;
        minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println("Calculated conversion: " + hours
                            + ":" + remainingMinutes +":" + remainingSeconds);
    }
}
