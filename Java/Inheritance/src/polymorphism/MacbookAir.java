package polymorphism;

public class MacbookAir extends Macbook{
    @Override
    public void start() {
        System.out.println("Macbook air booting up");
    }

    @Override
    public void shutdown() {
        System.out.println("Macbook air shutting down");
    }
}
