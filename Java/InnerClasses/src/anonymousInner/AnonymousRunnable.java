package anonymousInner;

public class AnonymousRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("anonymous runnable implementation");
            }
        });
        t.start();
    }
}
