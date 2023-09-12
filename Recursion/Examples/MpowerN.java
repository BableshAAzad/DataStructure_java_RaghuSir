package Recursion.Examples;

import java.util.Scanner;

public class MpowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int m = sc.nextInt();
        System.out.println("Enter power value : ");
        int n = sc.nextInt();
        sc.close();
        int p = power(m, n);
        System.out.println(m + " of power " + n + " is equal to : " + p);
    }

    private static int power(int m, int n) {
        if (n == 0)
            return 1;
        return m * power(m, n - 1);
    }
}
