package LambdaExpression.NameSortingUsingLength;

import java.util.*;

public class SortByLength {
    public static void main(String[] args) {
        Comparator<String> myComp = (s1, s2) -> ((Integer) s1.length()).compareTo(s2.length()) > 0 ? -1 : 1;
        TreeSet<String> names = new TreeSet<String>(myComp);
        names.add("Lalita");
        names.add("Bablesh");
        names.add("AAzad");
        names.add("Kajol");
        names.add("Ashwani");
        names.add("Durgesh");
        names.add("Ajani");
        System.out.println(names);
        // ---------------------------------
        for (String name : names) {
            System.out.println(name);
        }
    }
    /**
     * Output :
     * [Bablesh, Ashwani, Durgesh, Lalita, AAzad, Kajol, Ajani]
     * Bablesh
     * Ashwani
     * Durgesh
     * Lalita
     * AAzad
     * Kajol
     * Ajani
     */
}
