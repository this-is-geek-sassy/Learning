package RE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEmailValidator {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@+[a-zA-Z0-9_.-]+$");
        Matcher matcher = pattern.matcher("_abcdefghab...cdefghabcdefg@google.com");

        String email = "_abcdefghab...cdefghabcdefg@google.com";
//        email.matches("^[a-zA-Z0-9_.-]+@+[a-zA-Z0-9_.-]+$");

        if (email.matches("^[a-zA-Z0-9_.-]+@+[a-zA-Z0-9_.-]+$")) {
            System.out.println("valid email id");
        } else {
            System.out.println("invalid email id");
        }
    }
}
