package polymorphism;

public class Macbook implements AppleLaptop{
    @Override
    public void start() {
        System.out.println("Macbook Booking up");
    }
    @Override
    public void shutdown() {
        System.out.println("Macbook shutting down");
    }
}
