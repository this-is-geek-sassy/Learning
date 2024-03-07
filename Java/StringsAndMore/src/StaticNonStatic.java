public class StaticNonStatic {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
    static {
        System.out.println("One static block");
    }
    static {
        System.out.println("Another static block");
    }
}
