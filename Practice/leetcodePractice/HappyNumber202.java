package Practice.leetcodePractice;

public class HappyNumber202 {
    public static boolean isHappy(int n) {
        while (n > 9) {
            int sum = 0;
            do {
                int d = n % 10;
                sum = sum + d * d;
                n = n / 10;
            } while (n > 0);
            n = sum;
        }
        return n == 1 || n == 7;
    }

    public static void main(String[] args) {
        int n = 7;
        boolean bl = isHappy(n);
        System.out.println(bl);
    }
}
