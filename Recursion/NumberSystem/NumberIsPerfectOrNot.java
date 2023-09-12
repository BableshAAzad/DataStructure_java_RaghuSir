package Recursion.NumberSystem;

import java.util.Scanner;

public class NumberIsPerfectOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        boolean bl = isPerfect(n);
        if (bl)
            System.out.println(n + " is a perfect number");
        else
            System.out.println(n + " is not a perfect number ");
    }

    private static boolean isPerfect(int n) {
        return isPerfect(n, 1, 0);
    }

    private static boolean isPerfect(int n, int i, int sum) {
        if (i > n / 2)
            return n == sum;
        if (n % i == 0)
            sum = sum + i;
        return isPerfect(n, i + 1, sum);
    }
}
