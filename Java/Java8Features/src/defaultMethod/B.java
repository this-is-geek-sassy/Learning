package defaultMethod;

public class B implements A, X{

    @Override
    public void m1() {
        System.out.println("m1 inside B");
    }
}
