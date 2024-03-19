package staticInner;

public class OuterClass {
    static void f1() {
        System.out.println("Outers static method");
    }
    static class InnerClass {
        static void f2() {
            System.out.println("Inners static method");
        }
    }
    public static void main(String[] args) {
        OuterClass.f1();
        OuterClass.InnerClass.f2();
    }
}
