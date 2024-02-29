public class Main {
    public static void main(String[] args) {

        char charValue = 'B';
        switch (charValue) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in switch");
        }

        // function call will be here
        printDayOfWeek(7);
    }

    public static void printDayOfWeek (int day) {

        String dayofWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> {
                yield  "Monday";
            }
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "";
        };
        System.out.println("Day of week is = " + dayofWeek);
    }
}
