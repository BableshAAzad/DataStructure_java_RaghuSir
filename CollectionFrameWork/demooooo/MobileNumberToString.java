package collectionFrameWork.demooooo;

import java.util.HashMap;
import java.util.Scanner;

public class MobileNumberToString {
  static String isConvertString(String s) {
    s = s.toLowerCase();
    String[] num = s.split("");
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
    for (int i = 0; i < num.length; i++) {
      if (hm.containsKey(num[i]))
        sb.append(hm.get(num[i])+" ");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter mobile Number : ");
    String s = sc.nextLine();
    String num = isConvertString(s);
    System.out.println(num);
    sc.close();
  }
}