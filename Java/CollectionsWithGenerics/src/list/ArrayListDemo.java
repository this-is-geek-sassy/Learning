package list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(Integer.valueOf(20));
        list.add(10); // autoboxing
//        list.add(new Integer[]{10, 20, 30});
//        list.add(30.45);

        System.out.println(list);
    }
}
