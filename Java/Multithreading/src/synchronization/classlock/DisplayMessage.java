package synchronization.classlock;

public class DisplayMessage {
    public synchronized static void sayHello(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("How are you " + name);
//            System.out.println(i);
        }
    }
}
