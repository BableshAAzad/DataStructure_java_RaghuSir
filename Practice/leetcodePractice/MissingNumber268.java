package Practice.leetcodePractice;

import java.util.Arrays;

public class MissingNumber268 {
    public static int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums)); // [0, 1, 2, 3, 4, 5, 6, 7, 9]
        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] - 1 != nums[i - 1])
        // return nums[i - 1] + 1;
        // }
        // return 0;
        int n = nums.length;
        int sumOfAll = n * (n + 1) / 2;
        for (int i : nums) {
            sumOfAll -= i;
        }
        return sumOfAll;

    }

    public static void main(String[] args) {
        // int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int[] arr = { 0, 1 };
        int n = missingNumber(arr);
        System.out.println(n);
    }
}
/*
 * Example 1:
 * 
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range
 * [0,3]. 2 is the missing number in the range since it does not appear in nums.
 * Example 2:
 * 
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range
 * [0,2]. 2 is the missing number in the range since it does not appear in nums.
 * Example 3:
 * 
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range
 * [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */
