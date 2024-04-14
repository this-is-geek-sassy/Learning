package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList();
        ArrayList list = new ArrayList();
        list.add(Integer.valueOf(20));
        list.add(10); // autoboxing
        list.add(new Integer[]{10, 20, 30});
        list.add(30.45);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Object o = itr.next();
            System.out.println(o);
            if (o.getClass().isArray()){
                for (int element : (int[])o) {
                    System.out.println("inner array element: " + element);
                }
            }
        }

        System.out.println(list);
    }
}
