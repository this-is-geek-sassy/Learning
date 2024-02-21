import dailyChallenge.missingNumber.*;

public class Main {
    public static void main(String[] args) {

        int[] nums = {9,6,4,2,3,5,7,0,1};
        Solution1 solution1 = new Solution1();
        nums = solution1.missingNumber(nums);
        System.out.print("[ ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        } System.out.print(" ]\n");
    }
}