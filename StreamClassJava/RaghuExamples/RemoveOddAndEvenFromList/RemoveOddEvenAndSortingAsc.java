package StreamClassJava.RaghuExamples.RemoveOddAndEvenFromList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveOddEvenAndSortingAsc {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(23, 24, 16, 15, 12);
        List<Integer> evalues = values.stream().filter(t -> t % 2 == 0).sorted().collect(Collectors.toList());
        List<Integer> ovalues = values.stream().filter(t -> t % 2 == 1).sorted().collect(Collectors.toList());
        System.out.println(evalues);
        System.out.println(ovalues);
    }
}
