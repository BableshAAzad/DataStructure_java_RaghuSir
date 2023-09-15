package Recursion.Arrays.BinarySearch;

import java.util.Scanner;

// note: this method work only if elements present in shorting order
public class BinarySearchArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " values : ");
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter Element : ");
        int ele = sc.nextInt();
        sc.close();
        int in = binarySearch(ar, ele);
        if (in == -1)
            System.out.println("Value is Not present");
        else
            System.out.println("Present at : " + in + " index");
    }

    private static int binarySearch(int[] ar, int ele) {
        return binarySearch(ar, ele, 0, ar.length - 1);
    }

    private static int binarySearch(int[] ar, int ele, int low, int high) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (ar[mid] == ele)
            return mid;
        if (ele > ar[mid])
            return binarySearch(ar, ele, mid + 1, high);
        else
            return binarySearch(ar, ele, low, mid - 1);
    }
}
