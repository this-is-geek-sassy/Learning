package list;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Random randomObj = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            int number = randomObj.nextInt(5);
            list.add(number);
        }
        System.out.println("List: " + list);

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}
