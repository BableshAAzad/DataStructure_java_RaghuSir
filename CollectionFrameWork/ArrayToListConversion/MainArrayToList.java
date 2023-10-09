package CollectionFrameWork.ArrayToListConversion;

import java.util.*;

public class MainArrayToList {
    public static void main(String[] args) {
        /**
         * int[] ar = {23, 45, 54, 32, 63, 45};
         * List<Integer> values = new ArrayList<Integer>(ar.length);
         * for(Integer v : ar){
         * values.add(v);
         * }
         * System.out.println(values); // [23, 45, 54, 32, 63, 45]
         * System.out.println(values.size()); // 6
         */
        Integer[] ar = { 23, 45, 54, 32, 63, 45 };
        List values = new ArrayList<Integer>();
        Collections.addAll(values, ar);
        System.out.println(values);  // [23, 45, 54, 32, 63, 45]
        System.out.println(values.size()); // 6
    }
}
