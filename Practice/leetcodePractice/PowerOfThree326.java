package Practice.leetcodePractice;

public class PowerOfThree326 {
    public static boolean isPowerOfThree(int n) {
        if (n == 0)
            return false;
        for (int i = 0; i < n; i++) {
            if (n % 3 == 0 && i * i * i == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 9;
        boolean bl = isPowerOfThree(n);
        System.out.println(bl);
    }
}
