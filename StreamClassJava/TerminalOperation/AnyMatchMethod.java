package StreamClassJava.TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class AnyMatchMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 4, 1, 3);
        System.out.println(list.stream().anyMatch(e -> e == 2));
        System.out.println(list.stream().anyMatch(e -> e == 6));
    }
}
