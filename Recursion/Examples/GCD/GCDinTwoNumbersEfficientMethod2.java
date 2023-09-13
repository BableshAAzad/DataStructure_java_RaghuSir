package Recursion.Examples.GCD;

import java.util.Scanner;

public class GCDinTwoNumbersEfficientMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        sc.close();
        int cg = isGCDtwoNo(a, b);
        System.out.println("Here " + cg + " is a Greatest Common Diviser of both number");
    }

    private static int isGCDtwoNo(int a, int b) {
        int x = a < b ? a : b;
        int y = a > b ? a : b;
        while (x > 0) {
            if (y % x == 0)
                return x;
            x = y - x;
            y = y - x;
        }
        return 1;
    }
}
