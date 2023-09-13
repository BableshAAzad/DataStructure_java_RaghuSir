package Recursion.Strings;

import java.util.Scanner;

public class PalindromeOrNotStringRaghu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        sc.close();
        boolean bl = isPalindrome(str);
        if (bl)
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a palindrome");
    }

    private static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    private static boolean isPalindrome(String str, int f, int l) {
        if (f > l)
            return true;
        if (str.charAt(f) != str.charAt(l))
            return false;
        return isPalindrome(str, f + 1, l - 1);
    }
}
