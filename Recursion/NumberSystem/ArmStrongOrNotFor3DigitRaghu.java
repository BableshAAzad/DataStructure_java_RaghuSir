package Recursion.NumberSystem;

import java.util.Scanner;

public class ArmStrongOrNotFor3DigitRaghu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        boolean bl = isArmStrong(n);
        if (bl)
            System.out.println(n + " is a ArmStrong number");
        else
            System.out.println(n + " is not a ArmStrong");
    }

    private static boolean isArmStrong(int n) {
        return isArmStrong(n, 0, n);
    }

    private static boolean isArmStrong(int n, int sum, int temp) {
        if (n == 0)
            return sum == temp;
        int d = n % 10;
        return isArmStrong(n / 10, sum + d * d * d, temp);
    }
}
