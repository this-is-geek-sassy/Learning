package polymorphism;

public class Test {
    public static void main(String[] args) {
        AppleLaptop m1 = new MacbookPro();   // implicit "upcasting"
        AppleLaptop m2 = new MacbookAir();   // implicit "upcasting"

        MacbookPro m3 = (MacbookPro) m1;      // explicit down-casting

        m1.start();  m1.shutdown();
        m2.start();  m2.shutdown();

        ((MacbookPro) m1).screenGlowUp();
//        m1.screenGlowUp();   // gives error
    }
}
