package Recursion.Examples.GCD;

import java.util.Scanner;

public class GCDinTwoNumbersMethod1 {
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
        int gcd = 1;
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
