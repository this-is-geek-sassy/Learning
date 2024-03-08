package AccessModifiers;

public class A {
    private int a = 30;
    int b = 40;
    protected int c = 50;
    public int d = 60;

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.c);
        System.out.println(a1.d);
    }
}
