package java9.safeVarArgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarArgs {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("abc", "xyz");
        List<String> l2 = Arrays.asList("nyc", "lon");
        SafeVarArgs.myMethod(l1, l2);
    }

    @SafeVarargs
    public static void myMethod(List<String>...l) {
        // List<String>[]
        Object[] objects = l;
//        objects[0] = Arrays.asList(1,2);

        String name = (String) l[0].get(0);
        System.out.println(name);
    }
}
