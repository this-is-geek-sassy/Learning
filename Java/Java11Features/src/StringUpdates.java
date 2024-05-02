import java.util.stream.Collectors;

public class StringUpdates {

    public static void main(String[] args) {

        String str = "    c    ";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());

        String str2 = "I am \n the creator of my \n destiny";
        System.out.println(str2.lines().toList());

        char ch ='\u0029';
        ch = '\u2000';
        System.out.println(str2.length());
        str2 = ch + str2;
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println(str2.trim());
        System.out.println(str2.strip());    // java 11 method
        // 2 other strip methods:   stripLeading() & stripTrailing()

        System.out.println("-".repeat(100));
    }
}
