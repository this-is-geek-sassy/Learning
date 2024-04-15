package list;

import comparator.StringComparator;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new StringComparator());
        set.add("abcfnbuf");
        set.add("xyzbv");
        set.add("defjkqhfgqd   fkqojh");
        set.add("mnok");

        for (String elem: set) {
            System.out.println(elem);
        }
        System.out.println(set);
    }
}
