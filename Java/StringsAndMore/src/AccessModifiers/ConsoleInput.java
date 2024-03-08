package AccessModifiers;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.next());
        int num2 = scanner.nextInt();
        System.out.println("Output is: " + (num1+num2));
    }
}
