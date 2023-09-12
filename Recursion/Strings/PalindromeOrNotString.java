package Recursion.Strings;

import java.util.Scanner;

public class PalindromeOrNotString {
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
        return isPalindrome(str, "", 0);
    }

    private static boolean isPalindrome(String str, String rev, int i) {
        if (str.length() == i)
            return str.equals(rev);
        rev = str.charAt(i) + rev;
        return isPalindrome(str, rev, i + 1);
    }
}
