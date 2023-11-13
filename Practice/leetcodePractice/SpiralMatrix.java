package Practice.leetcodePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> l = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1, down = matrix.length - 1, top = 0;

        while (true) {
            for (int i = top; i <= right; i++)
                l.add(matrix[left][i]);
            left++;
            if (left > down)
                break;
            for (int i = left; i <= down; i++)
                l.add(matrix[i][right]);
            right--;
            if (top > right)
                break;
            for (int i = right; i >= top; i--)
                l.add(matrix[down][i]);
            down--;
            if (left > down)
                break;
            for (int i = down; i >= left; i--)
                l.add(matrix[i][top]);
            top++;
            if (top > right)
                break;
        }

        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int[][] mat = new int[n][m];
        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j < mat[i].length; j++) {
        // mat[i][j] = sc.nextInt();
        // }
        // }
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        List<Integer> l = spiralOrder(mat);
        System.out.println(l);
    }
}
/**
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
