package lambda.anonymous;

public class Test {

    public static void main(String[] args) {
//

        for (int i = 1; i < 11; i++) {
            System.out.println("main thread");
        }


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 11; i++) {
                    System.out.println("child thread");
                }
            }
        });
//        t.start();

        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 11; i++) {
                System.out.println("child thread 2");
            }
        });
        t2.start();
    }
}
