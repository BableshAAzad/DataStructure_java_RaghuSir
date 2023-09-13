package Recursion.Examples.LCM;

import java.util.Scanner;

public class LCMinTwoNumbersMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        sc.close();
        int cg = isLCMtwoNo(a, b);
        System.out.println("Here " + cg + " is a Lowest Common Multplir of both number");
    }

    private static int isLCMtwoNo(int a, int b) {
        int x = (a < b) ? a : b;
        int y = (a > b) ? a : b;
        for (int i = 1;; i++) {
            if (y * i % x == 0)
                return y * i;
        }
    }

}
