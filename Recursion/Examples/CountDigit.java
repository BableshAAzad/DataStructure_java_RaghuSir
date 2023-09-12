package Recursion.Examples;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int digit = digCount(n);
        System.out.println(n + " here " + digit + " digits present");
    }

    private static int digCount(int n) {
        if (n == 0)
            return 0;
        return 1 + digCount(n / 10);
    }
}
