public class StaticNonStatic {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
    static {
        System.out.println("One static block");
    }
    static {
        System.out.println("Another static block");
        StaticNonStatic.method1();
    }
    static void method1() {
        System.out.println("static method1 has been called");
    }
}
