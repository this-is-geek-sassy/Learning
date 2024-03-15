package exception;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        int a, b, c;
        try {
            System.out.println("enter two numbers:");
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            b = s.nextInt();
//            c = s.nextInt();
            c = a/b;
            System.out.println("Result: c = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Please do not enter 0 as denominator");
        }
    }
}
