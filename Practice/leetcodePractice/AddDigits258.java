package Practice.leetcodePractice;

public class AddDigits258 {
    public static int addDigits(int num) {
        if (num == 0)
            return 0;
        while (num > 9) {
            int n = 0;
            do {
                int d = num % 10;
                n = n + d;
                num = num / 10;
            } while (num != 0);
            num = n;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 10;
        int res = addDigits(n);
        System.out.println(res);
    }

    /*
     * Input: num = 38
     * Output: 2
     * Explanation: The process is
     * 38 --> 3 + 8 --> 11
     * 11 --> 1 + 1 --> 2
     * Since 2 has only one digit, return it.
     */
}
