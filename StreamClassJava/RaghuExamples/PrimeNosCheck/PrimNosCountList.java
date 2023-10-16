package StreamClassJava.RaghuExamples.PrimeNosCheck;

import java.util.Arrays;
import java.util.List;

public class PrimNosCountList {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(23, 56, 34, 48, 15, 28, 76, 43);
        long count = values.stream().filter(PrimNosCountList::isPrime).count();
        System.out.println("Total Number of prime is : " + count);
    }
}
