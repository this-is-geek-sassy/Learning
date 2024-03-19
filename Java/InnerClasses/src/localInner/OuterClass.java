package localInner;

public class OuterClass {
    void f1() {
        System.out.println("inside outer's f1");
        class LocalInner {
            void f2() {
                System.out.println("inside local inners f2");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.f2();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.f1();
    }
}
