public class Child extends Parent{
    int c, d;
    String s = "Child";
    Child() {
        super();   // calls by default
        System.out.println("Child object " + this);
    }

    public Child(int c, int d) {
        super();   // calls by default
        this.c = c;
        this.d = d;
    }

    public Child(int a, int b, int c, int d) {
        super(a,b);   // calls by default
        this.c = c;
        this.d = d;
    }
    public static void test1() {
        System.out.println("Inside child's test1 method");
    }
    @Override
    void f2() {
        super.f2();
        System.out.println(this);
        System.out.println("inside f2");
    }
}
