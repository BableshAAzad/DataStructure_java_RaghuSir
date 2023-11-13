package Practice.leetcodePractice;

public class RatateImage48 {
    // public static void rotate(int[][] matrix) {
    // int[][] max = new int[matrix.length][matrix[0].length];
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[0].length; j++) {

    // }
    // }
    // for (int i = 0; i < max.length; i++) {
    // for (int j = 0; j < max[0].length; j++) {
    // System.out.print(max[i][j]+" ");
    // }
    // }
    // }
    static void transePosaMatSqr(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[i].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
         for (int i = 0; i < mat.length; i++) {
            int f = 0, l = mat[0].length - 1;
            while (f < l) {
                int temp = mat[i][f];
                mat[i][f] = mat[i][l];
                mat[i][l] = temp;
                f++;
                l--;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        transePosaMatSqr(mat);
    }
}
