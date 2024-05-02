import java.util.Optional;

public class StringFeatures {

    public static void main(String[] args) {

        String s = "  All the power is within you. You can do anything and everything!";
        System.out.println("Original string:" + s);

        System.out.println("Indented string:" + s.indent(5));
//        System.out.println(s);
        System.out.println("Negatively indented string:" + s.indent(-2));

        String s1 = "10";
        System.out.println(Optional.of(s1.transform(Integer::parseInt)).get());
    }
}
