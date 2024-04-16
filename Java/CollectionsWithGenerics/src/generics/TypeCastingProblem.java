package generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {
    public static void main(String[] args) {
        String[] s = new String[10];
        s[0] = "John";
        s[1] = "Rob";
//        s[2] = 83;
        List<String> l = new ArrayList();
        l.add("John");
        l.add("Rob");
//        l.add(123);   // now this lines gives a compile-time error

        String name = (String) l.get(0);
        String name1 = (String) l.get(1);
        String name2 = (String) l.get(2);   // gives classCastException
        System.out.println(name2);
    }
}
