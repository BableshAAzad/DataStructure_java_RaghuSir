package Practice.leetcodePractice;

public class IsomorphicStrings205 {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() == 1)
        return true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && t.charAt(i) == t.charAt(j))
                    return true;
                else if (s.charAt(i) == t.charAt(i) && s.length()-1 == j)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "ab";
        String b = "ab";
        boolean bl = isIsomorphic(a, b);
        System.out.println(bl);
    }
}

/*
 * Example 1:
 * 
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * 
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * 
 * Input: s = "paper", t = "title"
 * Output: true
 */
