package collectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("z");
        l.add("a");
        l.add("x");
        l.add("b");
        System.out.println("before sorting: " + l);
        Collections.sort(l);
//        Collections.sort(l, new MyComparator());
        System.out.println("after sorting: " + l);

        int result = Collections.binarySearch(l, "z");
        System.out.println("index is: " + result);
        result = Collections.binarySearch(l, "c");
        System.out.println("index is: " + result);  // insertion point: if not found

        Collections.reverse(l);
        System.out.println(l);
    }
}
