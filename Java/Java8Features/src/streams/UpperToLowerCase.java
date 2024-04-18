package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("John");
        l1.add("Saswata");
        l1.add("Bharath");
        l1.add("Jim");

        List<String> l2 = l1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);
    }
}
