package synchronization.deadlock;

public class FirstResource {
    public synchronized void method1(SecondResource sr) {
        System.out.println("inside method1 of first resource");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("invoking method2 of second resource");
        sr.method2();
    }
    public synchronized void method2() {
        System.out.println("Inside method2 of first resource");
    }
}
