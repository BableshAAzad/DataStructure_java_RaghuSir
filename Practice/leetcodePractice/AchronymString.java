package Practice.leetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class AchronymString {
    public static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length())
            return false;
        for (int i = 0; i < words.size(); i++) {
            String c = words.get(i);
            if (c.charAt(0) != s.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "a";
        ArrayList<String> al = new ArrayList<String>();
        al.add("alice");
        al.add("abob");
        // al.add("charlie");

        boolean res = isAcronym(al, word);
        System.out.println(res);
    }
    /*
     * Input: words = ["alice","bob","charlie"], s = "abc"
     * Output: true
     */
}

/**
 * Example 1:
 * 
 * Input: words = ["alice","bob","charlie"], s = "abc"
 * Output: true
 * Explanation: The first character in the words "alice", "bob", and "charlie"
 * are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym.
 * Example 2:
 * 
 * Input: words = ["an","apple"], s = "a"
 * Output: false
 * Explanation: The first character in the words "an" and "apple" are 'a' and
 * 'a', respectively.
 * The acronym formed by concatenating these characters is "aa".
 * Hence, s = "a" is not the acronym.
 * Example 3:
 * 
 * Input: words = ["never","gonna","give","up","on","you"], s = "ngguoy"
 * Output: true
 * Explanation: By concatenating the first character of the words in the array,
 * we get the string "ngguoy".
 * Hence, s = "ngguoy" is the acronym.
 */