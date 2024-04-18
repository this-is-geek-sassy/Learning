package defaultMethod;

public interface X {

    default void m1() {
        System.out.println("default m1 inside A");
    }
}
