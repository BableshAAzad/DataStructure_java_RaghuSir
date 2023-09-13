package Recursion.NumberSystem;

import java.util.Scanner;

public class ReturnNthFabonaciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int nFabo = nthFaboNO(n);
        System.out.println(n + " Fabonaci number is : " + nFabo);
    }

    private static int nthFaboNO(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return nthFaboNO(n - 1) + nthFaboNO(n - 2);
    }
}
