package StreamClassJava.TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 4, 1, 3,1);
        list.stream().collect(Collectors.toSet())
        .forEach(System.out::println);
    }
}
