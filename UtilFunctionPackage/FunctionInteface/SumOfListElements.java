package UtilFunctionPackage.FunctionInteface;

import java.util.*;
import java.util.function.Function;

public class SumOfListElements {
    static Integer sumOfList(List<Integer> values) {
        Integer sum = 0;
        for (Integer ele : values)
            sum = sum + ele;
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(13);
        l.add(5);
        l.add(19);
        l.add(58);
        l.add(29);
        Integer i = SumOfListElements.sumOfList(l);
        System.out.println("Sum of List is : " + i); // * 124
        // !---------------------------------------------------------------------------
        Function<List<Integer>, Integer> fun = new Function<List<Integer>, Integer>() {
            @Override
            public Integer apply(List<Integer> t) {
                Integer sum = 0;
                for (Integer ele : t)
                    sum = sum + ele;
                return sum;
            }
        };
        Integer j = fun.apply(l);
        System.out.println("Sum of List using Anonemous : " + j); // * 124
        // !---------------------------------------------------------------------------
        Function<List<Integer>, Integer> fun1 = t -> {
            Integer sum = 0;
            for (Integer ele : t)
                sum = sum + ele;
            return sum;
        };
        Integer k = fun1.apply(l);
        System.out.println("Sum of Elements Using Lambda function : " + k); // * 124
        // !---------------------------------------------------------------------------
        Function<List<Integer>, Integer> fun2 = SumOfListElements::sumOfList;
        Integer sum = fun2.apply(l);
        System.out.println("Sum of elements using reference function : " + sum); // * 124
    }
}
