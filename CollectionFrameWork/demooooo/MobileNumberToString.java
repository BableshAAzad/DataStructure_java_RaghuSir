package collectionFrameWork.demooooo;

import java.util.HashMap;
import java.util.Scanner;

public class MobileNumberToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile Number : ");
        int n = sc.nextInt();
        String s = "" + n;
        String num = isConvertString(s);
        System.out.println(num);
    }
    static String isConvertString(String s) {
        s = s.toLowerCase();
        String[] ss = s.split("");
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("0", "zero");
        hm.put("1", "one");
        hm.put("2", "two");
        hm.put("3", "three");
        hm.put("4", "four");
        hm.put("5", "five");
        hm.put("6", "six");
        hm.put("7", "seven");
        hm.put("8", "eight");
        hm.put("9", "nine");
        StringBuffer sb = new StringBuffer();
        int count =0;
          for(int i =1; i<ss.length; i++){
              if(i<ss.length && ss[i] == ss[i-1]){
                  count++;
                if(count==1){
                 sb.append("double ");
                }else if(count==2){
                 sb.append("triple ");
                }
              }else if (i== 1 && count == 0) {
                sb.append(hm.get(ss[0]));
              }
          } 
        return sb.toString();
    }
}