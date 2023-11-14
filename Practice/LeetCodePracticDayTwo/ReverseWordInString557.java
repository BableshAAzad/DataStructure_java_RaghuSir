package Practice.LeetCodePracticDayTwo;

public class ReverseWordInString557 {
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        String result = "", temp = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                temp = arr[i].charAt(j) + temp;
            }
            result = result +" "+ temp;
            temp = "";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String s = "Bablesh kumar AAzad";
        String res = reverseWords(s);
        System.out.println(res);
    }
}
