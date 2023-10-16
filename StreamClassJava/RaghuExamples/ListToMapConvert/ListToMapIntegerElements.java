package StreamClassJava.RaghuExamples.ListToMapConvert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListToMapIntegerElements {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, 2, 4, 8, 2, 2, 1, 7, 8);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer val : num) {
            Integer count = map.get(val);
            if (count == null)
                map.put(val, 1);
            else
                map.put(val, count+1);
        }
        Set<Integer> i = map.keySet();
        for (Integer j : i) {
            System.out.println(j + " -> " + map.get(j));
        }
    }
}
