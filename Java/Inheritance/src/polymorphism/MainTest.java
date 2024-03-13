package polymorphism;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Default main method");
        // always this main method will be invoked
//        main(new int[1]);   // manually invoking overloaded main method
    }

    public static void main(int[] args) {
        System.out.println("Overloaded main method");
    }
}
