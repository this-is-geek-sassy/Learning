package AccessModifiers;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class ConsoleInput {
    public static void main(String[] args) {
        out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = parseInt(scanner.next());
        int num2 = scanner.nextInt();
        System.out.println("Output is: " + (num1+num2));
        out.println(sqrt(36));
        out.println(pow(num1, num2));
    }
}
