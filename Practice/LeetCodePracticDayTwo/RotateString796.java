package Practice.LeetCodePracticDayTwo;

public class RotateString796 {
    public static boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(0);
            s = s.substring(1) + ch;
            if (s.equals(goal))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean bl = rotateString(s, goal);
        System.out.println(bl);
        s = s.substring(1);
        System.out.println(s);
    }
}
/*
 * Example 1:
 * 
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 * Example 2:
 * 
 * Input: s = "abcde", goal = "abced"
 * Output: false
 */
