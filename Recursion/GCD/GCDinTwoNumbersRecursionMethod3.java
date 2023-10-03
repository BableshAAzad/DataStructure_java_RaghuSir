package Recursion.GCD;

import java.util.Scanner;

public class GCDinTwoNumbersRecursionMethod3 {
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
        if (a > b)
            return isGCDtwoNo(b, a);
        if (b % a == 0)
            return a;
        return isGCDtwoNo(b % a, a);
    }
}
