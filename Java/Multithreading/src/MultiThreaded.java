public class MultiThreaded extends Thread {

    public static void main(String[] args) throws InterruptedException {

        MultiThreaded mt = new MultiThreaded();
        mt.start();

        Thread currentThread = Thread.currentThread();
        System.out.println("thread name is: " + currentThread.getName());
        /*
        for (int j = 1; j <= 200; j++) {
            System.out.println("\t j = " + j);
            Thread.sleep((int)(Math.random()*1000));
        }
        */

//        System.out.println();
    }

    public void run() {

        Thread currentThread = Thread.currentThread();
        currentThread.setName("Print 200 numbers");
        System.out.println("thread name is: " + currentThread.getName());

//        for (int i = 1; i <= 200; i++) {
//
//            System.out.println("\t i = " + i);
//            try {
//                Thread.sleep((int)(Math.random()*1000));
//            } catch (InterruptedException e) {
//                System.out.println("Child thread exiting");
//            }
//        }
//        System.out.println();
    }

}
