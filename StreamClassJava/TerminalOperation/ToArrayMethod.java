package StreamClassJava.TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(2,5,4,1,3);
       Object[] ar = list.stream().toArray();
       System.out.println(ar[2]);
    }
}
