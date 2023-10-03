package Recursion.LCM;

import java.util.Scanner;

public class LCMinTwoNumbersRecursionMethod3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        sc.close();
        int cg = isLCMtwoNo(a, b);
        System.out.println("Here " + cg + " is a Greatest Common Diviser of both number");
    }

    private static int isLCMtwoNo(int a, int b) {
        if (a > b)
            return isLCMtwoNo(b, a);
        return isLCMtwoNo(a, b, b);
    }

    private static int isLCMtwoNo(int x, int y, int prod) {
        if (prod % x == 0)
            return prod;
        return isLCMtwoNo(x, y, prod + y);
    }
}
