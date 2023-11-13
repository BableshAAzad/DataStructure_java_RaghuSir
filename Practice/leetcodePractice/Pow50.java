package Practice.leetcodePractice;

public class Pow50 {
    public static double myPow(double x, int n) {
        double temp=0;
        double d = n;
        temp = Math.pow(x, d);
        return temp;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        double res = myPow(x, n);
        System.out.println(res);
    }
}
/**
 * Example 1:
 * 
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * Example 2:
 * 
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * Example 3:
 * 
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */