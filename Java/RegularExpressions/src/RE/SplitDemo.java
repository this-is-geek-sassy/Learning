package RE;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\s");
        String[] words = pattern.split("how are you ?");

        for (String word: words)
            System.out.println(word);
        System.out.println(Arrays.toString(words));


        String website = "www.saswata.mishra.com";
        String[] components = website.split("[.]+");
        System.out.println(Arrays.toString(components));
    }
}
