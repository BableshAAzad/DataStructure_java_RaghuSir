package Practice.LeetCodePracticDayTwo;

public class CountPrime204 {
    public static boolean isprime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return (count);
    }

    public static void main(String[] args) {
        int n = 10;
        int res = countPrimes(n);
        System.out.println(res);
    }
}
