package Recursion.Arrays;

import java.util.Scanner;
// Element present or not in array if present then return index otherwise return -1
// Serch start to first index
public class ElementPresentThenReturnIndexForword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values : ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter a element : ");
        int ele = sc.nextInt();
        sc.close();
        int in = presentOrNot(ar, ele);
        if (in == -1)
            System.out.println("Element not present");
        else
            System.out.println("Present in : " + in + " index");
    }

    private static int presentOrNot(int[] ar, int ele) {
        return presentOrNot(ar, ele, 0);
    }

    private static int presentOrNot(int[] ar, int ele, int in) {
        if (in >= ar.length)
            return -1;
        if (ar[in] == ele)
            return in;
        return presentOrNot(ar, ele, in + 1);
    }
}
