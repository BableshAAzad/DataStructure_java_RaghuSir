package Practice.leetcodePractice;

public class TruncateSantace1816 {
    public static String truncateSentence(String s, int k) {
         String[] sp = s.split(" ");
         int i =0;
        StringBuffer sb = new StringBuffer();
         while (k>0) {
            sb.append(sp[i++]+" ");
            k--;
         }
         String miss = sb.toString();
        return miss.trim();
    }

    public static void main(String[] args) {
        String name = "Hello how are you Contestant";
        int n = 4;
        String res = truncateSentence(name, n);
        System.out.println(res);
    }
}
