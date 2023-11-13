package Practice.leetcodePractice;

public class AlterNatingDigitSum {
    public static int alternateDigitSum(int n) {
        int sum = 0;
        String s = "" + n;
        int x = s.length();
        while (x > 0) {
            int d = n % 10;
            if (x % 2 == 1)
                sum = sum + d;
            else
                sum = sum - d;
            n = n / 10;
            x--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 111;
        int sum = alternateDigitSum(n);
        System.out.println(sum);
    }
}
