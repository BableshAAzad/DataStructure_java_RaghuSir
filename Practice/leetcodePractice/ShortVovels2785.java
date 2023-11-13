package Practice.leetcodePractice;

public class ShortVovels2785 {
    public static String sortVowels(String s) {
        char[] ch = s.toCharArray();
        String temp = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                for (int j = i; j < ch.length; j++) {
                    int x = j;
                    if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                        ch[i] = ch[j];
                        temp = temp + ch[x];
                        break;
                    } else
                        x++;
                }
            } else
                temp = temp + ch[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        String str = "lEetcOde"; // ^ lEOtcede
        String s = sortVowels(str);
        System.out.println(s);
    }
}

/**
 * Input: s = "lEetcOde"
 * Output: "lEOtcede"
 * Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd'
 * are all consonants. The vowels are sorted according to their ASCII values,
 * and the consonants remain in the same places.
 * Example 2:
 * 
 * Input: s = "lYmpH"
 * Output: "lYmpH"
 * Explanation: There are no vowels in s (all characters in s are consonants),
 * so we return "lYmpH".
 */