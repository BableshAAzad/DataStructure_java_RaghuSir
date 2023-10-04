package SequencialSearchingTechnique;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] ar = { 34, 56, 78, 28, 58, 39, 45, 29 };
        // Output : [28, 29, 34, 39, 45, 56, 58, 78]
        mergeSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    static void mergeSort(int[] x) {
        mergeSort(x, 0, x.length - 1);
    }

    static void mergeSort(int[] x, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergeSort(x, l, m);
            mergeSort(x, m + 1, h);
            merge(x, l, m, h);
        }
    }

    static void merge(int[] x, int l, int m, int h) {
        int[] a = new int[h - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= h) {
            if (x[i] < x[j])
                a[k++] = x[i++];
            else
                a[k++] = x[j++];
        }
        while (i <= m)
            a[k++] = x[i++];
        while (j <= h)
            a[k++] = x[j++];
        for (i = 0; i < a.length; i++)
            x[l + i] = a[i];
    }
}
