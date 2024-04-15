package list;

import java.util.*;

public class DifferentSets {
    public static void main(String[] args) {
        Random obj = new Random();
//        HashSet<Integer> set = new HashSet<>();      // does not retain insertion order
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();   // maintains insertion order

        Set<Integer> set = new TreeSet<>();    // reorders in ascending order
        for (int i = 1; i <= 5; i++) {
            int number = obj.nextInt(100);
            set.add(number);
            System.out.println("adding number: " + number);
        }
        System.out.println("linked hashset elements: " + set);

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Object o = itr.next();
            System.out.println(o);
            if (o.getClass().isArray()){
                for (int element : (Integer[])o) {
                    System.out.println("inner array element: " + element);
                }
            }
        }

        System.out.println(set);
    }
}
