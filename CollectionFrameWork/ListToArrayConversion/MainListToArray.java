package CollectionFrameWork.ListToArrayConversion;

import java.util.*;

public class MainListToArray {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Lalita");
        names.add("Bablesh");
        names.add("AAzad");
        names.add("Chaturvedani");
        names.add("Kajol");
        names.add("Ashwani");
        names.add("Durgesh");
        System.out.println(names);
        // [Lalita, Bablesh, AAzad, Chaturvedani, Kajol, Ashwani, Durgesh]
        /**
         * String[] str = new String[names.size()];
         * int i = 0;
         * for (String name : names) {
         * str[i] = name;
         * i++;
         * }
         * System.out.println(Arrays.toString(str));
         * // [Lalita, Bablesh, AAzad, Chaturvedani, Kajol, Ashwani, Durgesh]
         */
        String[] str = names.toArray(new String[0]);
        System.out.println(Arrays.toString(str));
        System.out.println(str.length); // 7
        // [Lalita, Bablesh, AAzad, Chaturvedani, Kajol, Ashwani, Durgesh]
    }
}
