package optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();
        System.out.println("Optional: " + optional);
        System.out.println(optional.isEmpty());

        Optional<String> data = Optional.of("Optional but very useful");
        System.out.println("data: " + data);
        System.out.println(optional.isPresent());
    }
}