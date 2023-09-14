package Recursion.NumberSystem;

import java.util.Scanner;

public class StrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int sum = isStrong(n);
        if (n == sum)
            System.out.println("Number is strong");
        else
            System.out.println("Not a strong number");
    }

    private static int isStrong(int n) {
        return isStrong(n, 0);
    }

    private static int isStrong(int n, int sum) {
        if (n == 0)
            return sum;
        sum = sum + isStrong(n % 10, sum, 0);
        return isStrong(n / 10, sum);
    }

    private static int isStrong(int n, int sum, int i) {
        if (n == 0 || n == 1)
            return 1;
        return n * isStrong(n-1, sum, i);
    }
}
