package interrupt;

public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child thread -- lazy");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("got interrupted");
        }
    }
}
