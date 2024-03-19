package threadComm;

public class MyThread extends Thread{

    int total;
    @Override
    public void run() {
        System.out.println("Child thread is calculating the sum:");
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
        }
        this.notify();      /* throwing exception:
                             * Exception in thread "Thread-0" java.lang.IllegalMonitorStateException: current thread is not owner
                             * at java.base/java.lang.Object.notify(Native Method)
                             * at threadComm.MyThread.run(MyThread.java:14)
                            */
    }
}
