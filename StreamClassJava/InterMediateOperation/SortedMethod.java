package StreamClassJava.InterMediateOperation;

import java.util.Arrays;
import java.util.List;

public class SortedMethod {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("bc", "ab", "cd");
        l.stream().sorted().forEach(System.out::println);
    }
    /*
     * Output :
     * ab
     * bc
     * cd
     */
}
