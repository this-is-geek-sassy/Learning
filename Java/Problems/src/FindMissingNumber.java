import java.util.ArrayList;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {9,2,4,6,3,7,5,1,0,10,8,12};
        ArrayList<Integer> minMax;

        minMax = findMinMax(array);
        int min = minMax.get(0), max = minMax.get(1), size = max - min + 1;
        long desiredSum = ((max * (max + 1)) / 2) - (((min-1) * min) / 2);
        long actualSum=0;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        int missingElement = (int)(desiredSum - actualSum);
        System.out.println(missingElement);
    }
    public static ArrayList<Integer> findMinMax(int[] array) {
        int min, max;
        if (array[0] < array[1]) {
            min = array[0];
            max = array[1];
        }
        else {
            min = array[1];
            max = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            else if (array[i] > max) {
                max = array[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(min);
        list.add(max);
        return list;
    }
}
