package Practice.LeetCodePracticDayTwo;

public class MostCommonWord819 {
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] temp = paragraph.split(" ");
        return null;
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };
        String result = mostCommonWord(paragraph, banned);
        System.out.println(result);
    }
}

/*
 * Example 1:
 * Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.",
 * banned = ["hit"]
 * Output: "ball"
 * 
 * Example 2:
 * Input: paragraph = "a.", banned = []
 * Output: "a"
 */