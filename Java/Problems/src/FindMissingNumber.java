public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {9,2,4,6,3,7,5,0,1,10,8,12};
        int size = array.length;
        long desiredSum = (size * (size + 1)) / 2;
        long actualSum=0;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        int missingElement = (int)(desiredSum - actualSum);
        System.out.println(missingElement);
    }
}
