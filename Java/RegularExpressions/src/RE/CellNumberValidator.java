package RE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CellNumberValidator {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher("_abcdefghab...cdefghabcdefg@google.com");
        matcher = pattern.matcher("8282950574");

        if (matcher.matches()) {
            System.out.println("valid mobile number");
        } else {
            System.out.println("invalid mobile number");
        }
    }
}
