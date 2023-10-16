package StreamClassJava.InterMediateOperation;

import java.util.Arrays;
import java.util.List;

public class SkipMethod {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("bc", "ab", "bc");
        l.stream().skip(1).forEach(System.out::println);
    }
    /*
     * Output :
     * ab
     * bc
     */
}
