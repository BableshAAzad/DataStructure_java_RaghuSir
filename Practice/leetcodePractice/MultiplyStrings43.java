package Practice.leetcodePractice;

import java.math.BigInteger;

public class MultiplyStrings43 {
    public static String multiply(String num1, String num2) {
        BigInteger A = new BigInteger(num1);
        BigInteger B = new BigInteger(num2);

        BigInteger mux = A.multiply(B);
        return "" + mux;
    }

    public static void main(String[] args) {
        String a = "498828660196";
        String b = "840477629533";
        String res = multiply(a, b);
        System.out.println(res); // ^ 419254329864656431168468
    }

    /*
     * Example 1:
     * 
     * Input: num1 = "2", num2 = "3"
     * Output: "6"
     * Example 2:
     * 
     * Input: num1 = "123", num2 = "456"
     * Output: "56088"
     */
}
