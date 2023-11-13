package Practice.leetcodePractice;

public class DivideTwoInteger29 {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1;
        long a = dividend;
        long b = divisor;
        if (a < 0 && b < 0) {
            a = a * (-1);
            b = b * (-1);
            long x = a/b;
            System.out.println(x);
            // x = x*(-1);
            // System.out.println(x);
            int y = (int)x;
            System.out.println(y);
        }
        long c = a / b;
        int d = (int) c;
        // System.out.println(d);
    }
}
