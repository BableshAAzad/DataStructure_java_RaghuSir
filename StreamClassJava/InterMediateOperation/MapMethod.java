package StreamClassJava.InterMediateOperation;

import java.util.Arrays;
import java.util.List;

public class MapMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 4, 1, 3);
        list.stream().filter(e -> e % 2 == 0).map(e -> e + ",").forEach(System.out::print);
        System.out.println("\n-----------");
        list.stream().map(e -> e + ",").forEach(System.out::print);
    }
}
