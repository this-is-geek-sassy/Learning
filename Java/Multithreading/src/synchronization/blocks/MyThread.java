package synchronization.blocks;

public class MyThread extends Thread{
    private DisplayMessage dm;
    private int counter;
    private String name;
    public MyThread(DisplayMessage dm, String name) {
        this.dm = dm;
        this.name = name;
        this.counter = 0;
    }
    @Override
    public void run() {
//        for (int i = 0; i < 5; i++) {
//            dm.sayHello(name);
//            System.out.println("++i: " + ++i);
//        }
        dm.sayHello(name);
    }
}
