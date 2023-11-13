package Practice.leetcodePractice;

import java.util.Arrays;

public class PluseOne66 {
    public static int[] plusOne(int[] digits) {
        int temp = digits[digits.length - 1];
        temp = temp + 1;
        // String s = "" + temp;
        int[] auto = new int[digits.length + 1];
        int b = auto.length - 1;
        do {
            int d = temp % 10;
            auto[b--] = d;
            temp = temp / 10;
        } while (temp > 0);
        if (digits.length > 1) {
            for (int i = 0; i < digits.length - 3; i++) {
                auto[i] = digits[i];
            }
        }
        return auto;
    }

    public static void main(String[] args) {
        // int[] n = {
        // 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7,
        // 4, 9, 4, 7, 0, 1, 1, 1, 7,
        // 4, 0, 0, 6 };
        // int[] n = { 9 };
        int[] n = { 1, 2, 3 };
        int[] arr = plusOne(n);
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * Example 1:
 * 
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * Example 2:
 * 
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * Example 3:
 * 
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */