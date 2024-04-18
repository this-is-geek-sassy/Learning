package predicate;

import java.util.function.Predicate;

public class PredicateJoins {

    public static void main(String[] args) {
        int[] x = {0, 10, 20, 30, 40, 50, 60, 70};
        Predicate<Integer> p1 = i -> (i > 10);
        System.out.println("greater than 10: ");
        method1(p1, x);
    }

    public static void method1(Predicate<Integer> predicate, int[] array) {
        for (int e: array) {
            if (predicate.test(e))
                System.out.println(e);
        }
    }
}
