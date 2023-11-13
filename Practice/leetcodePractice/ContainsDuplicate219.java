package Practice.leetcodePractice;

import java.util.Arrays;

public class ContainsDuplicate219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Arrays.sort(nums);
        int nu = nums.length, count = 1;
        for (int i = 1; i < nu; i++) {
            if (nums[i] == nums[i - 1] && nums[i] == k)
                count++;
            else
                break;
        }
        for (int i = 1; i < nu; i++) {
            if (count % 2 != 0 && nums[i] == k)
                return true;
            else
                count = 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] arr = { 1,2,3,1,2,3};
        boolean bl = containsNearbyDuplicate(arr, n);
        System.out.println(bl);
    }
}
/*
 * Example 1:
 * 
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * 
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * 
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */