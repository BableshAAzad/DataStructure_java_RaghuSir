package StreamClassJava.RaghuExamples.CountEvenNosInList;

import java.util.Arrays;
import java.util.List;

public class CountEventNos {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(5, 2, 3, 2, 1, 7, 9);
        // ----------------------------------------------------------
        int ecount = (int) values.stream().filter(a -> a % 2 == 0).count();
        System.out.println("Total even number here : " + ecount);
        // ----------------------------------------------------------
        int big = values.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println("Beggest element is : " + big);
        // --------------------Method-I------------------------------
        int sum = values.stream().reduce((a,b)->a+b).get();
        System.out.println("Sum of elements is : "+sum);
        // --------------------Method-II-----------------------------
        int sum1 = values.stream().reduce(0,(a,b)->a+b).intValue();
        System.out.println("Sum of elements is : "+sum1);
    }
}
