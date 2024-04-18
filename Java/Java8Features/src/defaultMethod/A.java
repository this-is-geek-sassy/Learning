package defaultMethod;

public interface A {

    default void m1() {
        System.out.println("default m1 inside A");
    }
}
