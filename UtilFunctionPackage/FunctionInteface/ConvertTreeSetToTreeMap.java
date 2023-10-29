package UtilFunctionPackage.FunctionInteface;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;

public class ConvertTreeSetToTreeMap {
    public static void main(String[] args) {
        Comparator<String> myComp = (s1, s2) -> ((Integer) s1.length()).compareTo(s2.length()) > 0 ? -1 : 1;
        TreeSet<String> names = new TreeSet<String>(myComp);
        names.add("Durgesh");
        names.add("Kajol");
        names.add("AAzad");
        names.add("Bablesh");
        names.add("Chaturvedani");
        names.add("Lalita");
        names.add("Raja");
        Map<String, Integer> m = new TreeMap<String, Integer>();
        Function<String, Integer> fun = name -> name.length();
        for (String name : names)
            m.put(name, fun.apply(name));
        Set<String> s = m.keySet();
        for (String k : s)
            System.out.println("Names : " + k + ", length : " + m.get(k));
    }
    /*
     * Names : AAzad, length : 5
     * Names : Bablesh, length : 7
     * Names : Chaturvedani, length : 12
     * Names : Durgesh, length : 7
     * Names : Kajol, length : 5
     * Names : Lalita, length : 6
     * Names : Raja, length : 4
     */
}
