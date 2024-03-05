public class Palindrome {
    public static void main(String[] args) {
        String input = "abfca";
        java.lang.StringBuilder string = new java.lang.StringBuilder(input);

        System.out.println(input.equals(string.reverse().toString()));
    }
}
