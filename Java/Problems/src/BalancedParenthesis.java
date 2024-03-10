import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the balanced paranthesis string");
        String balancedParenthesisString = ip.next();
//        System.out.println(checkString(balancedParenthesisString));
//        System.out.println(balancedParenthesisString);
        if (!checkString(balancedParenthesisString)) {
            System.out.println("bad input");
            return;
        }
        Stack<String> s = new Stack<String>();
        for (int i = 0; i < balancedParenthesisString.length(); i++) {
            char c = balancedParenthesisString.charAt(i);
            if (c == '(') {
                s.push("(");
            } else {
                s.pop();
            }
        }
        if (s.empty())
            System.out.println("it is a string of balanced parenthesis");
        else
            System.out.println("it is not a string of balanced parenthesis");
    }
    public static boolean checkString (String balancedParenthesisString) {
        for (int i = 0; i < balancedParenthesisString.length(); i++) {
            char c = balancedParenthesisString.charAt(i);
            if (c != '(' && c!= ')')
                return false;
        }
        return true;
    }
}
