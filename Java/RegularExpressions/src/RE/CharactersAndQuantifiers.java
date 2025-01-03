package RE;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {

    public static void main(String[] args) {

        System.out.println(Pattern.matches("[abc]*", ""));
        System.out.println(Pattern.matches("[abc]*", "ddd"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "143dG"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "143d_"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}", "143d"));
    }
}
