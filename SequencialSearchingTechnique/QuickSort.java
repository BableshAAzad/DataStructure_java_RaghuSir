package SequencialSearchingTechnique;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ar = { 34, 45, 26, 23, 15, 56, 35, 28 };
        // Output : [15, 23, 26, 28, 34, 35, 45, 56]
        quickSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    static void quickSort(int[] ar) {
        quickSort(ar, 0, ar.length - 1);
    }

    static void quickSort(int[] ar, int low, int hight) {
        if (low < hight) {
            int j = partition(ar, low, hight);
            quickSort(ar, low, j - 1);
            quickSort(ar, j + 1, hight);
        }
    }

    static int partition(int[] x, int low, int hight) {
        int pivot = x[low];
        int i = low + 1;
        int j = hight;
        while (i <= j) {
            while (i <= hight && x[i] < pivot)
                i++;
            while (j >= low && x[j] > pivot)
                j--;
            if (i < j) {
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
        }
        x[low] = x[j];
        x[j] = pivot;
        return j;
    }
}
