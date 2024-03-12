package abstraction;

public class Honda implements Car{
    @Override
    public void go() {
        System.out.println("Honda acr goes");
    }

    @Override
    public void stop() {
        System.out.println("Honda car stops");
    }
}
