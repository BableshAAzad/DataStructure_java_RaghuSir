package UtilFunctionPackage.PredicateInteface;

import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        Predicate<Integer> prd1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t % 2 == 0;
            }
        };
        Predicate<Integer> prd2 = t -> t % 2 == 0;
        System.out.println("Is 10 is even ? : " + prd1.test(10)); // ? true
        System.out.println("Is 10 is even ? : " + prd1.test(9)); // ? false
        System.out.println("Is 10 is even ? : " + prd2.test(10)); // * true
        System.out.println("Is 10 is even ? : " + prd2.test(9)); // * false

    }
}
