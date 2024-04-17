package lambda.runnable;

public class MyRunnableImpl implements Runnable {
    @Override
    public void run() {

        for (int i = 1; i < 11; i++) {
            System.out.println("child thread");
        }
    }
}
