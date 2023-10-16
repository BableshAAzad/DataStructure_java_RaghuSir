package StreamClassJava.InterMediateOperation;

import java.util.Arrays;
import java.util.List;

public class FilterMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 4, 1, 3);
        list.stream().filter(e->e%2==0).forEach(System.out::println);
    }
}
