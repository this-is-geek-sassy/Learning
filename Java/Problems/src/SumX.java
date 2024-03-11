import java.util.Arrays;

public class SumX {
    public static boolean searchTarget(int[] array, int low, int high, int target) {
        while (low <= high) {
            int middle = low + (high - low)/2;

            if (array[middle] == target) {
//                return array[middle];
                return true;
            }
            if (target < array[middle])
                high = middle-1;
            else
                low = middle+1;
        }
//        return Integer.MIN_VALUE;  // special value to indicate target not found
        return false;
    }
    public static void main(String[] args) {
        int[] array = {9,2,4,6,3,7,5,0,1,10,8,12};
        int sum = 20;
        Arrays.sort(array);
        boolean isTargetFound = false;
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("");
        for (int i = 0; i < array.length-1; i++) {
            int target = sum - array[i];

            isTargetFound = searchTarget(array, i+1, array.length-1, target);
            if (isTargetFound) {
                System.out.println("Found the pair: " + array[i] + " and " + target);
                break;
            }
        }
        if (!isTargetFound)
            System.out.println("no such pair exists in the given array");
    }
}
