package Recursion.Examples;

import java.util.Scanner;

public class FactorialOfNRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("----------------");
        int fact = factOfN(n);
        System.out.println("Factorial of " + n + " is : " + fact);
    }

    private static int factOfN(int n) {
        if(n==0 || n==1) 
           return 1;
        return n*factOfN(n-1);
    }
}
