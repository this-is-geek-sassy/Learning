package lambda.runnable;

public class Test {

    public static void main(String[] args) {
//        Runnable r = new MyRunnableImpl();
//        Thread t = new Thread(r);
//        t.start();

        for (int i = 1; i < 11; i++) {
            System.out.println("main thread");
        }

        Runnable r = () -> {
            for (int i = 1; i < 11; i++) {
                System.out.println("child thread");
            }
        };
//        r.run();
        Thread t = new Thread(r);
        t.start();
    }
}
