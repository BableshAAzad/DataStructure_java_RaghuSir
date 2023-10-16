package StreamClassJava.TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,4,1,3);
         list.stream().forEach(System.out::print);
    }
}
