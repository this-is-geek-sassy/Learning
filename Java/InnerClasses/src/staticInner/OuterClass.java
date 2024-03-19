package staticInner;

public class OuterClass {
    static void f1() {
        System.out.println("Outers static method");
    }
    static class InnerClass {
        static void f2() {
            System.out.println("Inners static method");
        }
        void f3() {
            System.out.println("non static method inside the inner class");
        }
    }
    public static void main(String[] args) {
        OuterClass.f1();
        OuterClass.InnerClass.f2();
        OuterClass.InnerClass innerObj = new OuterClass.InnerClass();
        innerObj.f3();
    }
}
