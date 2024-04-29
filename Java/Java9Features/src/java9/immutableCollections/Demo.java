package java9.immutableCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        // Collections.of method creates a

        List<String> list = List.of("abc", "xyz", "123");
        System.out.println(list);
//        list.add("nyc");   // throws exception

        Set<Integer> set = Set.of(23, 67, 34);
        // if you try to add duplicate element here, you'll get a IllegalArgumentException
        System.out.println(set);
//        set.add(98);

        Map<String, Integer> map = Map.of("saswata", 83, "devi", 95);
//        Map.ofEntries()
        System.out.println(map);
    }
}
