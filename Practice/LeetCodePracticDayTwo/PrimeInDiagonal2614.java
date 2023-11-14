package Practice.LeetCodePracticDayTwo;

public class PrimeInDiagonal2614 {
    public static int diagonalPrime(int[][] nums) {
        int prime = 0, i = 0, j = nums.length - 1;
        while (i < nums.length && j < nums.length) {
            boolean bl = isPrime(nums[i][i]);
            if (bl) {
                if (nums[i][i] > prime)
                    prime = nums[i][i];
            }
            boolean bx = isPrime(nums[i][j]);
            if (bx) {
                if (nums[i][j] > prime)
                    prime = nums[i][j];
            }
            i++;
            j--;
        }
        return prime;
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 5, 17, 7 }, { 9, 11, 10 } };
        int res = diagonalPrime(arr);
        System.out.println(res);
    }
}
