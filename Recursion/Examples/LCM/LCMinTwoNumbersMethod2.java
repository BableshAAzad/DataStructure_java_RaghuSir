package Recursion.Examples.LCM;

import java.util.Scanner;

public class LCMinTwoNumbersMethod2 {
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
        int prod = y;
        while (true) {
            if (prod % x == 0)
                return prod;
            prod = prod + y;
        }
    }
}
