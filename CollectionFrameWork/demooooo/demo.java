package collectionFrameWork.demooooo;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        String temp = "7777";
        char[] s = temp.toCharArray();
        System.out.println(Arrays.toString(s));
        
        int count=0;
        for (int i = 0; i < s.length; i++) {
           if(s[i]==temp.charAt(i))
                count++;
    }
    System.out.println(count);
}
}