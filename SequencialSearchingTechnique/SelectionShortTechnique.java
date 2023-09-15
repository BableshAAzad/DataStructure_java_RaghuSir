package SequencialSearchingTechnique;

import java.util.Scanner;

public class SelectionShortTechnique {
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
        selectionSort(ar);
        System.out.println("After Selection Shorting : ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    private static void selectionSort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            int mi = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] < x[mi])
                    mi = j;
            }
            if (mi != i) {
                int temp = x[i];
                x[i] = x[mi];
                x[mi] = temp;
            }
        }
    }
}
