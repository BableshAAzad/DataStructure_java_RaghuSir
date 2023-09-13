package Recursion.NumberSystem;

import java.util.Scanner;

public class ArmStrongOrNotFor3Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        boolean bl = isArmStrong(n);
        if (bl)
            System.out.println(n + " is a palindrome number");
        else
            System.out.println(n + " is not a palindrome");
    }

    private static boolean isArmStrong(int n) {
        return isArmStrong(n, n, 0, 0);
    }

    private static boolean isArmStrong(int n, int temp, int sum, int d) {
        if (n == 0)
            return sum == temp;
        d = n % 10;
        sum = sum + d * d * d;
        return isArmStrong(n / 10, temp, sum, 0);
    }
}
