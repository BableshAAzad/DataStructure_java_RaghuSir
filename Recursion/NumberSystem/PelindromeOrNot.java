package Recursion.NumberSystem;

import java.util.Scanner;

public class PelindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        boolean bl = isPalindrome(n);
        if (bl)
            System.out.println(n + " is a Pelindrome");
        else
            System.out.println(n + " is not a palindrome");
    }

    private static boolean isPalindrome(int n) {
        return isPalindrome(n, 0, n);
    }

    private static boolean isPalindrome(int n, int rev, int temp) {
        if (n == 0)
            return temp == rev;
        rev = rev * 10 + n % 10;
        return isPalindrome(n / 10, rev, temp);
    }
}
