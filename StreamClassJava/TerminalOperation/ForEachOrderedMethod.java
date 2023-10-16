package StreamClassJava.TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class ForEachOrderedMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 4, 1, 3);
        list.stream().forEachOrdered(System.out::println);
    }
}
