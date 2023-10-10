package LambdaExpression.NameSortingAtoZ;

import java.util.*;

public class MainSortingZtoA {
    public static void main(String[] args) {
        // Comparator<String> myComp = (s1, s2) -> s1.compareTo(s2) > 0 ? 1 : -1;
        TreeSet<String> names = new TreeSet<String>((s1, s2) -> s1.compareTo(s2) > 0 ? -1 : 1); // or myComp
        names.add("Lalita");
        names.add("Bablesh");
        names.add("AAzad");
        names.add("Kajol");
        names.add("Ashwani");
        names.add("Durgesh");
        names.add("Ajani");
       System.out.println(names);
    }
    // Output : 
    // [AAzad, Ajani, Ashwani, Bablesh, Durgesh, Kajol, Lalita]
}
