package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        Object[] objects = new Object[100000];

        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Object();
        }
        List<Object> list = new LinkedList<>();

        Long start = System.currentTimeMillis();
        for (Object object: objects) {
            list.add(object);
        }
        Long end = System.currentTimeMillis();
        System.out.println("time taken: " + (end - start));
    }
}
