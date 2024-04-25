package RE;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {

    public static void main(String[] args) {

        File directory = new File("./src/testFolder");
        String[] fileNames = directory.list();

        Pattern pattern = Pattern.compile("\\w+[.]txt$");

        int count = 0;
        assert fileNames != null;
        for (String fileName: fileNames) {
            Matcher matcher = pattern.matcher(fileName);
            if (matcher.matches()) {
                count++;
                System.out.println(fileName);
            }
//            System.out.println(fileName);
//            count++;
        }
        System.out.println("No of text files: " + count);
    }
}
