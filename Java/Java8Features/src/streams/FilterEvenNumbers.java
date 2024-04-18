package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        System.out.println(l1);

//        List<Integer> l2 = new ArrayList<>();
//        for (Integer i: l1) {
//            if (i%2 == 0) {
//                l2.add(i);
//            }
//        }

        List<Integer> l2 = l1.stream().filter(i -> (i%2 == 0)).collect(Collectors.toList());
        long noOfEvenNos = l1.stream().filter(i -> (i%2 == 0)).count();
        System.out.println("No of even nos: " + noOfEvenNos);
        System.out.println(l2);

        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> s1 = l1.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(s1);

        Integer max = l1.stream().max(comparator).get();
        System.out.println(max);
        Integer min = l1.stream().min(comparator).get();
        System.out.println(min);

        l1.stream().forEach(i -> System.out.println(i));
    }
}
