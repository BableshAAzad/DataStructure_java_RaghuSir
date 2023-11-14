package Practice.LeetCodePracticDayTwo;

import java.util.Arrays;

public class MaximumProductofThreeNumbers628 {
    public static int maximumProduct(int[] nums) {
        int pro = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                nums[i] = nums[i] * (-1);
        }
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        pro = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return pro;
    }

    public static void main(String[] args) {
        int[] arr = { -100, -98, -1, 2, 3, 4 }; // * 39200
        int res = maximumProduct(arr);
        System.out.println(res);
    }
}
