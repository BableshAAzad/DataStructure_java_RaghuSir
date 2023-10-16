package StreamClassJava.RaghuExamples.DistinctElements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Print3DistinctFruit {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "mango", "papaya", "orange", "promegrante",
                "mango", "watermaloon", "graps", "mango", "apple", "pineapple", "butterfruit", "papaya");
        List<String> f = fruits.stream().distinct().limit(3).collect(Collectors.toList());
        System.out.println("3 Distinct fruits is : "+f);
    }
}
