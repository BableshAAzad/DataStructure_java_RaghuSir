package StreamClassJava.TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class NoneMatchMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 4, 1, 3);
        System.out.println(list.stream().noneMatch(e -> e == 6));
        System.out.println(list.stream().noneMatch(e -> e/1 == e));
    }
}
