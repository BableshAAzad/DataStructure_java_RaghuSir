package Recursion.Examples;

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int prod = prodOfDigit(n);
        System.out.println(n + " of digit product is : " + prod);
    }

    private static int prodOfDigit(int n) {
        if (n < 10)
            return n;
        return n % 10 * prodOfDigit(n / 10);
    }
}
