package StreamClassJava.RaghuExamples.PrimeNosCheck;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DistinctPrimeNosCount {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(23, 56, 34, 48, 15, 28, 76, 43, 23, 43, 17, 19, 17, 34, 36);
        long count = values.stream().distinct().filter(DistinctPrimeNosCount::isPrime).count();
        System.out.println("Here distinct prime number is : " + count);
        // ------------------Normal-Method-------------------------------
        Set<Integer> primeSet = new TreeSet<Integer>();
        for (Integer ele : values) {
            if (isPrime(ele))
                primeSet.add(ele);
        }
        System.out.println(primeSet);
        System.out.println("Using TreeSet Total Prime nos is : " + primeSet.size());
    }
}
