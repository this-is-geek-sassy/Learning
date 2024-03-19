package nonStaticInner;

public class OuterClass {
    private static int x=50;
    private int y;
    public OuterClass(int y) {
        this.y = y;
    }
    class Inner {
        private int y;
        public Inner(int y) {
            this.y = y;
        }
        void f2() {
//            System.out.println("inner class's non-static method");
            System.out.println(OuterClass.x);
            System.out.println(OuterClass.this.y);
            System.out.println(this.y);
        }
    }
    void f1() {
        System.out.println("outer class's non-static method");
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass(80);
        outer.f1();
        OuterClass.Inner inner = outer.new Inner(32);
        inner.f2();
    }
}
