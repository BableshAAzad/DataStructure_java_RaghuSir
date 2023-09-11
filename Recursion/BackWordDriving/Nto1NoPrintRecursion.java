package Recursion.BackWordDriving;

import java.util.Scanner;

public class Nto1NoPrintRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("----------------");
        display(n);
        sc.close();
    }

    private static void display(int n) {
        if(n==0)
          return;
        System.out.println(n);
        display(n-1);
    }
}
