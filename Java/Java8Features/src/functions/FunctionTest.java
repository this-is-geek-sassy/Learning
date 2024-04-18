package functions;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<String, Integer> function = s -> s.length();

        System.out.println(function.apply("saswata"));
        System.out.println(function.apply("Coca Cola"));
    }
}
