package generics;

public class AnyRunnableTest {
    public static void main(String[] args) {
        AnyRunnable<OneClass> t = new AnyRunnable<>();
        AnyRunnable<AnotherClass> s = new AnyRunnable<>();
    }
}
