public class Parent {
    int a, b;
    String s = "Parent";
    public Parent() {
        System.out.println("Parents object " + this);
    }
    public Parent (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static void test1() {
        System.out.println("inside parent's test1 method");
    }
    void f1() {
        System.out.println("inside f1");
    }
    void f2() {
        System.out.println("inside parent's s2 method");
    }
}
