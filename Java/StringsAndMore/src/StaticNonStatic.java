public class StaticNonStatic {

    static int num;

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(StaticNonStatic.num);   // will definitely return zero each time
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
