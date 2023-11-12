package collectionFrameWork.UpdateValues;

import java.util.*;

public class IcrementListElement {
    public static void main(String[] args) {
        /**
         * List<Integer> values = new ArrayList<Integer>();
         * values.add(23);
         * values.add(56);
         * values.add(34);
         * values.add(48);
         * values.add(15);
         * System.out.println(values);
         */
        List<Integer> values = Arrays.asList(23, 56, 34, 48, 15);
        System.out.println(values); // [23, 56, 34, 48, 15]
        /**
         * Method - I
         * for (int i = 0; i < values.size(); i++) {
         * values.set(i, values.get(i)+10);
         * }
         * System.out.println(values); // [33, 66, 44, 58, 25]
         */
        // Method - II
        List<Integer> nv = new ArrayList<Integer>(values.size());
        for(Integer v : values){
            nv.add(v+10);
        }
        // System.out.println(nv); // [33, 66, 44, 58, 25]
        values = nv; 
        System.out.println(values); // [33, 66, 44, 58, 25]
    }
}
