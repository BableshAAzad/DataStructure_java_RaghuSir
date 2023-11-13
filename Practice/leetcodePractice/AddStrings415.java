package Practice.leetcodePractice;

import java.math.BigInteger;

public class AddStrings415 {
    public static String addStrings(String num1, String num2) {
        BigInteger A = new BigInteger(num1);
        BigInteger B = new BigInteger(num2);

        BigInteger mux = A.add(B);
        return "" + mux;
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "123";
        String c = addStrings(a, b);
        System.out.println(c);
    }
}
