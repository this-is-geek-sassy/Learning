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

        List<Integer> secondList = new ArrayList<>();
        secondList.add(111);
        secondList.add(222);
        secondList.add(333);
        System.out.println("second list : " + secondList);

        list.addAll(0, secondList);
        System.out.println("first list after adding second list: " + list);

        if(list.contains(122)){
            System.out.println("list has the value");
        } else {
            System.out.println("list does not have the value");
        }

        System.out.println("elements of the 1st list are:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        boolean t;
        t = list.remove(Integer.valueOf(333));
        System.out.println(list);
        System.out.println(t);
        t = list.remove(Integer.valueOf(300));
        System.out.println(list);
        System.out.println(t);
    }
}
