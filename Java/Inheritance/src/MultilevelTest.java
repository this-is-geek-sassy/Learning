public class MultilevelTest {
    public static void main(String[] args) {
        Child c = new Child(1,2, 3, 4);
        c.f1();
        c.f2();
        c.hashCode();

        Parent d = new Child();
        d.f1();
//        d.f2();
    }
}
