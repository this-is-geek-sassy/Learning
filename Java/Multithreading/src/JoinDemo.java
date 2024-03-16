import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n, sum=0;
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        System.out.println("Sum of first n numbers");
        System.out.println("Enter a value for n:");
        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
        JoinDemo.n = scanner.nextInt();

        JoinDemo jd = new JoinDemo();
        jd.start();
        jd.join();

        System.out.println("Sum of first " + JoinDemo.n +" numbers: " + JoinDemo.sum);
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start)/1000 + " seconds");
    }
    public void run() {
        for (int i = 1; i <= JoinDemo.n; i++) {
            JoinDemo.sum += i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
