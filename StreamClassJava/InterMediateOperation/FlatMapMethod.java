package StreamClassJava.InterMediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapMethod {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("bc", "ab", "cd");
        l.stream().flatMap(a -> Stream.of(a.charAt(0))).forEach(System.out::print);
        System.out.println("\n----------------------");
        l.stream().flatMap(a -> Stream.of(a.charAt(1))).forEach(System.out::print);

    }
}
