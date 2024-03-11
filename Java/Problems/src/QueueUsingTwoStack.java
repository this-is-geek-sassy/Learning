import java.util.Stack;

public class QueueUsingTwoStack {

    Stack<Integer> s1;
    Stack<Integer> s2;
    QueueUsingTwoStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public boolean enqueue (int element) {
        s1.push(element);
        return true;
    }
    public Integer dequeue () {
        if (s2.empty() && !s1.empty()) {
            for (int i = 1; i <= s1.size(); i++) {
                Integer num = s1.pop();
                s2.push(num);
            }
            System.out.println("Stacks after rearranging: " + this.toString());
            return s1.pop();
        } else if (!s2.empty()) {
            return s2.pop();
        }
        return -9999;  // special value to indicate error
    }
    public String toString() {
        return s2.toString() + " " + s1.toString();
    }

    public boolean isEmpty() {
        if (s1.empty() && s2.empty())
            return true;
        return false;
    }
    public int size() {
        return s1.size() + s2.size();
    }
    public static void main(String[] args) {

        QueueUsingTwoStack queue = new QueueUsingTwoStack();
        queue.enqueue(32);
        System.out.println(queue);
        queue.enqueue(45);
        System.out.println(queue);
        queue.enqueue(13);
        System.out.println(queue);

        System.out.println("Queue size: " + queue.size());

        System.out.println(queue.dequeue());
        System.out.println(queue);

        queue.enqueue(-1);
        System.out.println(queue);
        queue.enqueue(1);
        System.out.println(queue);

        System.out.println("Queue size: " + queue.size());

        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}
