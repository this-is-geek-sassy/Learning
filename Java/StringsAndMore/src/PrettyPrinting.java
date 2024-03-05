import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274f;
        System.out.printf("Formatted number is %.2f \n", a);

        System.out.printf("Pi is: %.3f \n", (float)Math.PI);

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 200));
        System.out.println("a" + 1);

        System.out.println("Saswata" + new ArrayList<>());
        System.out.println(new Integer(23)  + "" + new ArrayList<>());
    }
}
