import java.util.Optional;

public class OptionalUpdates {

    public static void main(String[] args) {

        Optional<String> str = Optional.empty();
        // before java 11
        if (str.isPresent()) {
            System.out.println("present");
        } else {
            System.out.println("empty");
        }
        // since java 11
        if (str.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("present");
        }
    }
}
