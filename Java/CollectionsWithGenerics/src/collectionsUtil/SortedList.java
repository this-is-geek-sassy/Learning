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
        System.out.println("after sorting: " + l);
    }
}
