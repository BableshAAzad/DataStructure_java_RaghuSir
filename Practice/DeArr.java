package Practice;

import java.util.Arrays;

public class DeArr {
    public static void main(String[] args) {
        int[] a = new int[6];
        // a[4] = 4;
        a[2] = 2;
        // a[1] = 1;
        a[5] = 5;
        // a[3] = 3;
        // a[0] = 0;
        Arrays.stream(a).forEach(System.out::println);
    }
}
