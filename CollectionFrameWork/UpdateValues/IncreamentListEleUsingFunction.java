package CollectionFrameWork.UpdateValues;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IncreamentListEleUsingFunction {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(5, 3, 6, 2, 4, 9);
        System.out.println(values); // [5, 3, 6, 2, 4, 9]
        /**
         * Method - I
         * Function<Integer, Integer> maps = new Function<Integer,Integer>() {
         * 
         * @Override
         *           public Integer apply(Integer t){
         *           return t+10;
         *           }
         *           };
         */
        /**
         * Method - II
         * Function<Integer, Integer> maps = t-> t+10;
         */
        /**
         * Method - III
         * Stream<Integer> s1 = values.stream();
         * Stream<Integer> s2 = s1.map(t -> t + 10);
         * values = s2.collect(Collectors.toList());
         * System.out.println(values); // [15, 13, 16, 12, 14, 19]
         */
        // Method - IV
        values = values.stream().map(t -> t + 10).collect(Collectors.toList());
        System.out.println(values); // [15, 13, 16, 12, 14, 19]
    }
}
