package StreamClassJava.InterMediateOperation;

import java.util.Arrays;
import java.util.List;

public class DisticntMethod {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("bc", "ab", "bc");
        l.stream().distinct().forEach(System.out::println);
    }
    /*
     * Output :
     * bc
     * ab
     */
}
