package Recursion.NumberSystem;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        boolean bl = isPrime(n);
        if (bl)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }

    private static boolean isPrime(int n) {
        return isPrime(n, 2);
    }

    private static boolean isPrime(int n, int i) {
        if (i > n / 2)
            return true;
        if (n % i == 0)
            return false;
        return isPrime(n, i + 1);
    }
}
