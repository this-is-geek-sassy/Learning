import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter two numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Sum if the 2 numbers is : " + (a+b));
    }
}
