package synchronization.classlock;

public class SynchronizationDemo {
    public static void main(String[] args) {
//        DisplayMessage dm = new DisplayMessage();
        MyThread t1 = new MyThread("Steve");
        MyThread t2 = new MyThread("Mark");

        t1.start();
        t2.start();
    }
}
