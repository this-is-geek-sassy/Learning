package arraysUtil;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = {40, 10, 15, 7};
        System.out.println("before sort: ");
        System.out.print("[");
        for (int elem: a)
            System.out.print(elem + " ");
        System.out.print("]\n");

        Arrays.sort(a);

        System.out.println("after sort: ");
        System.out.print("[");
        for (int elem: a)
            System.out.print(elem + " ");
        System.out.print("]\n");
    }
}
