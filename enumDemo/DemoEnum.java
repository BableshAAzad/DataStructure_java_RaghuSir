package enumDemo;

import java.util.Arrays;

enum days {
    
    days(int n) {
       
    }
    MON(0), TUE(1), WED(2);
}

public class DemoEnum {
    public static void main(String[] args) {
        // System.out.println(days.valueOf("MON")); // MON
        // System.out.println(days.values()); // return address

        // days d[] = days.values();
        // for (int i = 0; i < d.length; i++) {
        // System.out.println(d[i]);
        // }

        // System.out.println(Arrays.toString(days.values()));
    }
}
