package StreamClassJava.TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class CountMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,4,1,3);
         System.out.println(list.stream().count());
    }
}
