package polymorphism;

public class MacbookPro extends Macbook{
    @Override
    void start() {
        System.out.println("Mackbook Pro booting up");
    }

    @Override
    void shutdown() {
        System.out.println("Macbook pro shutting down");
    }
}
