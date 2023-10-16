package StreamClassJava.InterMediateOperation;

import java.util.Arrays;
import java.util.List;

public class LimitMethod {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("bc", "ab", "cd");
        l.stream().limit(2).forEach(System.out::println);
    }
    /*
     * Output :
     * bc
     * ab
     */
}
