package SequencialSearchingTechnique;

import java.util.Scanner;

public class InsertionSortTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenth of Array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
        insertionSort(ar);
        System.out.println("After Insertion Shorting : ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    private static void insertionSort(int[] x) {
        for (int i = 1; i < x.length; i++) {
            int v = x[i];
            int j = i - 1;
            while (j >= 0 && x[j] > v) {
                x[j + 1] = x[j];
                j--;
            }
            x[j + 1] = v;
        }
    }
}
