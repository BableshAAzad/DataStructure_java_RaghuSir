package Recursion.Arrays;

import java.util.Scanner;

public class SumOfElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values : ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
        int sum = sumOfArray(ar);
        System.out.println("Sum of Array Elements is : " + sum);
    }

    private static int sumOfArray(int[] ar) {
        return sumOfArray(ar, 0);
    }

    private static int sumOfArray(int[] ar, int in) {
        if (in >= ar.length)
            return 0;
        return ar[in] + sumOfArray(ar, in + 1);
    }
}
