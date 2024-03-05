import java.lang.reflect.Array;
import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("Integer.toString(56, 34) :- " + Integer.toString(56, 34));
        System.out.println(new Integer(78).toString());   // deprecated
        System.out.println("Kunal");
        System.out.println(new int[] {2, 3, 4, 5});
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));

        String name = null;
        System.out.println(name);
    }
}
