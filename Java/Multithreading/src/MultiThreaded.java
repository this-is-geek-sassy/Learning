public class MultiThreaded extends Thread {

    public static void main(String[] args) {

        MultiThreaded mt = new MultiThreaded();
        mt.start();

        for (int j = 1; j <= 200; j++) {

            System.out.print("\t j = " + j);
        }
        System.out.println();
    }

    public void run() {
        for (int i = 1; i <= 200; i++) {

            System.out.print("\t i = " + i);
        }
        System.out.println();
    }

}
