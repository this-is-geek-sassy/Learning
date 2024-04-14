package list;

import java.util.ArrayList;
import java.util.List;

public class listMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 10; i <= 100; i+=10) {
            list.add(i);
        }
        System.out.println(list);
        list.add(2, 1000);
        System.out.println(list);

        list.set(3, 200);  // replace element
        System.out.println(list);
    }
}
