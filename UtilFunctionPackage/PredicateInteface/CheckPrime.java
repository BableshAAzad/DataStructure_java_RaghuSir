package UtilFunctionPackage.PredicateInteface;

import java.util.LinkedHashSet;
import java.util.function.Predicate;

public class CheckPrime {
    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(13);
        lhs.add(65);
        lhs.add(19);
        lhs.add(58);
        lhs.add(29);
        Predicate<Integer> pd = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return isPrime(i);
            }
        };
        for (Integer i : lhs) {
            System.out.println(i + " is prime : " + pd.test(i));
        }
        System.out.println("------------------------");
        Predicate<Integer> pd1 = x -> CheckPrime.isPrime(x);
        lhs.forEach(x -> System.out.println(x + " is prime : " + pd1.test(x)));
        System.out.println("------------------------");
        Predicate<Integer> pd2 = CheckPrime::isPrime;
        lhs.forEach(x -> System.out.println(x + " is prime : " + pd2.test(x)));
    }
    /*
     * 13 is prime : true
     * 65 is prime : false
     * 19 is prime : true
     * 58 is prime : false
     * 29 is prime : true
     */
}
