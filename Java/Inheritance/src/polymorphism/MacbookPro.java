package polymorphism;

public class MacbookPro extends Macbook{
    @Override
    public void start() {
        System.out.println("Mackbook Pro booting up");
    }

    @Override
    public void shutdown() {
        System.out.println("Macbook pro shutting down");
    }
    public void screenGlowUp() {
        System.out.println("Screen is running beautiful screensavers");
    }
}
