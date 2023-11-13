package Practice.leetcodePractice;

import java.util.Arrays;

public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        char[] ar1 = s.toCharArray();
        char[] ar2 = t.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
         for (int i = 0; i < ar2.length; i++) {
            if(ar1[i] != ar2[i])
             return false;
         }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean bl = isAnagram(s, t);
        System.out.println(bl);
    }
}

/*
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * 
 * Input: s = "rat", t = "car"
 * Output: false
 */