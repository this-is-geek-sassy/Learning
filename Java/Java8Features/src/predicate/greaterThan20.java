package predicate;

import java.util.function.Predicate;

public class greaterThan20 {

    public static void main(String[] args) {

        Predicate<Integer> check = (Integer i) -> {
            return i > 20;
        };
        System.out.println(check.test(30));
        System.out.println(check.test(20));
        System.out.println(check.test(15));
    }
}
