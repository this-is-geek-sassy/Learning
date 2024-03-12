package polymorphism;

public class Test {
    public static void main(String[] args) {
        AppleLaptop m1 = new MacbookPro();
        AppleLaptop m2 = new MacbookAir();

        m1.start();  m1.shutdown();
        m2.start();  m2.shutdown();
    }
}
