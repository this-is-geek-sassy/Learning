public class Parent {
    int a, b;
    public Parent() {
        System.out.println("Parents object " + this);
    }
    public Parent (int a, int b) {
        this.a = a;
        this.b = b;
    }
    void f1() {
        System.out.println("inside f1");
    }
    void f2() {
        System.out.println("inside parent's s2 method");
    }
}
