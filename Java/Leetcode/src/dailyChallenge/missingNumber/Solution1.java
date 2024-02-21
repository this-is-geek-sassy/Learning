package dailyChallenge.missingNumber;

public class Solution1 {

    public int[] nums = {9,6,4,2,3,5,7,0,1};

    public int[] missingNumber(int[] nums) {
//        int[] newNums = recursiveSwap(nums, 0, true);
        for (int i=0; i < nums.length; i++){
            int num = nums[i];
            if (num >= nums.length) {
                continue;
            }
            else if (num < nums.length)
                nums = recursiveSwap(nums, i, true);
        }

        return nums;
    }
    public static int[] recursiveSwap (int[] nums, int i, boolean isFirstCall) {
        if (i >= nums.length)
            return nums;
        int number = nums[i];

        if(number == -1) {
            nums[i] = i;
            return nums;
        }
        int temp = nums[number];
        nums[number] = number;
        // nums[i] = -1;
        nums[i] = (isFirstCall) ? -1 : i;
        return recursiveSwap(nums, temp, false);
    }
}
