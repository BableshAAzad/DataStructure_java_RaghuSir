package StreamClassJava.RaghuExamples.CountTheFrequencyOfEachCharInStr;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyEachChar {
    public static void main(String[] args) {
        String str = "Bablesh AAzad";
        Map<Integer, Long> fcount = str.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        fcount.entrySet().forEach(e -> System.out.println((char) (int) e.getKey() + " -> " + e.getValue()));
    }
    /**
     * Output :
     *   -> 1
     * A -> 2
     * a -> 2
     * b -> 1
     * B -> 1
     * s -> 1
     * d -> 1
     * e -> 1
     * h -> 1
     * z -> 1
     * l -> 1
     */
}
