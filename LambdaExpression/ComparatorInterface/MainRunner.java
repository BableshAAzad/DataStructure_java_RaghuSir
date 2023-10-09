package LambdaExpression.ComparatorInterface;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        /**
         * List<Integer> values = new ArrayList<Integer>();
         * values.add(45);
         * values.add(64);
         * values.add(89);
         * values.add(58);
         * values.add(38);
         */
        List<Integer> values = Arrays.asList(45,65,89,58,38);
       /** System.out.println(values);  // [45, 65, 89, 58, 38]
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer v1, Integer v2){
                return -v1.compareTo(v2);
            }
        };
        */
        // Comparator<Integer> com = (Integer v1, Integer v2)->{return -v1.compareTo(v2);};
        // Comparator<Integer> com = (Integer v1, Integer v2)-> -v1.compareTo(v2);
        // Comparator<Integer> com = (v1, v2)-> -v1.compareTo(v2);
        Collections.sort(values, (v1,v2)-> -v1.compareTo(v2));
        System.out.println(values); // [89, 65, 58, 45, 38]
    }
}
