package nonStaticInner;

public class OuterClass {
    class Inner {
        void f2() {
            System.out.println("inner class's non-static method");
        }
    }
    void f1() {
        System.out.println("outer class's non-static method");
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.f1();
        OuterClass.Inner inner = outer.new Inner();
        inner.f2();
    }
}
