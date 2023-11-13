package Practice.leetcodePractice;

public class MergeIntervals65 {
    public static int[][] merge(int[][] intervals) {
        int[][] temp = new int[intervals.length][intervals[0].length];
        System.out.println(temp.length);
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[0].length; j++) {
            
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 3 },
                        { 2, 6 },
                        { 8, 10 },
                        { 15, 18 }
        };
        int[][] res = merge(mat);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.println(res[i][j] + " ");
            }
        }
    }
}
/**
 * Example 1:
 * 
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * Example 2:
 * 
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
