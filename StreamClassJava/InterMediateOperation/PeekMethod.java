package StreamClassJava.InterMediateOperation;

import java.util.Arrays;
import java.util.List;

public class PeekMethod {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("bc", "ab", "cd");
        l.stream().peek(System.out::println).findFirst();
    }
    /*
     * Output :
     * bc
     */
}
