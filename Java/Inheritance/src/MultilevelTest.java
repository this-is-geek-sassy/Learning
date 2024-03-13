public class MultilevelTest {
    public static void main(String[] args) {

        Child.test1();
        Parent.test1();

        Child c = new Child(1,2, 3, 4);
        c.f1();
        c.f2();
        c.hashCode();
        System.out.println(c.s);

        Parent d = new Parent();
        d.f1();
        d.f2();
        System.out.println(d.s);

        Parent d2 = new Child();
        d2.f1();
        d2.f2();
        System.out.println(d2.s);
    }
}
