package Recursion.Examples;

import java.util.Scanner;

public class SumOfNnaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("----------------");
        int sum = sumOfN(n);
        System.out.println("Sum of " + n + " naturals number is : " + sum);
    }

    private static int sumOfN(int n) {
        if (n == 1)
            return 1;
        return n + sumOfN(n - 1);
    }
}
