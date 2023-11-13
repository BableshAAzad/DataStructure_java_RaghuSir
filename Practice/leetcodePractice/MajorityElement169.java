package Practice.leetcodePractice;

public class MajorityElement169 {
    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int count = 0, temp = 0, zero = 0, x = 0;
        boolean[] bl = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (bl[i] == false) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                        bl[i] = true;
                    }
                }
            }
            if (count > temp) {
                temp = count;
                zero = nums[i];
            }
            count = 0;
        }
        return zero;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 6, 6, 7, 7 }; // 3,3,4 // 2, 2, 1, 1, 1, 2, 2 // 6,6,6,7,7
        int res = majorityElement(arr);
        System.out.println(res);
    }
}
