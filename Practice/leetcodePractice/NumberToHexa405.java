package Practice.leetcodePractice;

public class NumberToHexa405 {
    public static String toHex(int num) {
        if(num == 0){
            return "0";
        }
        long val = num;
        if(num < 0){
            val = (long) (Math.pow(2,32) + num);
        }
        
        StringBuilder res = new StringBuilder();
        while (val != 0){
            int remainder = (int) (val - (((int) (val / 16)) * 16));
            val = val /16;
            if(remainder >= 10){
                res.append((char) (remainder + 87));
            }else {
                res.append(remainder);
            }
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 26;
        String s = toHex(n);
        System.out.println(s);
    }
}
/*
 * Example 1:
 * 
 * Input: num = 26
 * Output: "1a"
 * Example 2:
 * 
 * Input: num = -1
 * Output: "ffffffff"
 */
