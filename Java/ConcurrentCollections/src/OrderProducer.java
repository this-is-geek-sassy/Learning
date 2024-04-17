import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable{

    private BlockingQueue<String> queue;

    public OrderProducer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("Macbook pro");
            queue.put("Dell laptop");
            queue.put("Iphone");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
