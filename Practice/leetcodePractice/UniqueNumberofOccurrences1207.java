package Practice.leetcodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueNumberofOccurrences1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        boolean[] bl = new boolean[arr.length];
        int[] abc = new int[arr.length];
        int count = 1, x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (bl[i] == false) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        bl[i] = true;
                    }
                }
                abc[x++] = count;
                count = 0;
            }
        }
        System.out.println(Arrays.toString(abc));
        for (int i = 0; i < abc.length; i++) {
            for (int j = i + 1; j < abc.length; j++) {
                if (abc[i] == abc[j] && abc[i] != 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        boolean bl = uni(arr);
        System.out.println(bl);
    }

    public static boolean uni(int[] arr) {
        int count = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x = 0; x < arr.length; x++) {
            for (int j = x + 1; j < arr.length; j++) {
                if (arr[x] == arr[j])
                    count++;
            }
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], count);
            }
            count = 1;
        }

        System.out.println(map);
        // for (int i : arr) {
        // map.put(i, map.getOrDefault(i, 0) + 1);
        // }
        // Set<Integer> set = map.entrySet().stream()
        // .map(Map.Entry::getValue)
        // .collect(Collectors.toSet());

        // return set.size() == map.size();
        return true;
    }
}
