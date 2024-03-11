import java.util.HashSet;
import java.util.Set;

public class SubstringWithoutRepetition {
    public static void main(String[] args) {
        String s = "Thisisasamplestringwithoutcharacterrepetition";
        int uniqueRangeLength = 0;

//        int i, j, I=0, J=0;
//        for (i = 0; i < s.length()-1; i++) {
//            char c = s.charAt(i);
//            int length = 0;   // iteration specific variable
//            for (j = i+1; j < s.length(); j++) {
//                char b = s.charAt(j);
//                if (b != c)
//                    length++;
//                else
//                    break;
//            }
//            if (length > uniqueRangeLength) {
//                uniqueRangeLength = length;
//                I = i;
//                J = j;
//            }
//        }
//        System.out.println("The biggest substring with no repeating characters is: ");
//        System.out.println(s.substring(I,J));

        Set<Character> characterSet = new HashSet<>();
        int left=0, right, LEFT=-1, RIGHT=-1;

        for (right = 0; right < s.length(); right++) {
            if (!characterSet.contains(s.charAt(right))) {
                characterSet.add(s.charAt(right));
//                uniqueRangeLength = Math.max(uniqueRangeLength, right-left+1);
                if (uniqueRangeLength < (right-left+1)) {
                    uniqueRangeLength = right-left+1;
                    RIGHT = right;
                    LEFT = left;
                }
            } else {
                while (characterSet.contains(s.charAt(right))) {
                    characterSet.remove(s.charAt(left));
                    left++;
                }
                characterSet.add(s.charAt(right));
            }
        }
//        System.out.println(s.length());
        System.out.println(uniqueRangeLength);
        System.out.println("Longest substring: " + s.substring(LEFT, RIGHT));
    }
}
