package predicate;

import java.util.function.Predicate;

public class LengthOfString {

    public static void main(String[] args) {

        Predicate<String> predicate = (s -> (s.length() > 5));
        System.out.println(predicate.test("xyz"));
        System.out.println(predicate.test("saswata"));
    }
}
