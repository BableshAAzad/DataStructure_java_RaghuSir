package StreamClassJava.RaghuExamples.ListToMapConvert;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapAndMakeValueNoOfRepeataion {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "mango", "papaya", "orange", "promegrante",
                "mango", "watermaloon", "graps", "mango", "apple", "pineapple", "butterfruit", "papaya");
        Map<String, Integer> fcount = new TreeMap<String, Integer>();
        for (String fname : fruits) {
            Integer count = fcount.get(fname);
            if (count == null)
                fcount.put(fname, 1);
            else
                fcount.put(fname, count + 1);
        }
        System.out.println("Fruit name and values how many times present : ");
        Set<String> i = fcount.keySet();
        for (String j : i)
            System.out.println(j + " -> " + fcount.get(j));
        System.out.println("---------------------------------------------");
        Map<String, Long> fmCount = fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<String> k = fmCount.keySet();
        System.out.println("Using Stream API : ");
        for (String j : k)
            System.out.println(j + " -> " + fmCount.get(j));
    }
    /*
     * Fruit name and values how many times present :
     * apple -> 3
     * banana -> 1
     * butterfruit -> 1
     * graps -> 1
     * mango -> 3
     * orange -> 1
     * papaya -> 2
     * pineapple -> 1
     * promegrante -> 1
     * watermaloon -> 1
     * ---------------------------------------------
     * Using Stream API : 
     * orange -> 1
     * papaya -> 2
     * banana -> 1
     * watermaloon -> 1
     * apple -> 3
     * pineapple -> 1
     * promegrante -> 1
     * graps -> 1
     * butterfruit -> 1
     * mango -> 3
     */
}
