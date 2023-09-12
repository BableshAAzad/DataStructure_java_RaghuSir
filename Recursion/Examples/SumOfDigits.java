package Recursion.Examples;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int sumD = digitSum(n);
        System.out.println(n + " of digit sum is : " + sumD);
    }

    private static int digitSum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + digitSum(n / 10);
    }
}
