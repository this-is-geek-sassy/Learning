package polymorphism;

public class MacbookAir extends Macbook{
    @Override
    void start() {
        System.out.println("Macbook air booting up");
    }

    @Override
    void shutdown() {
        System.out.println("Macbook air shutting down");
    }
}
