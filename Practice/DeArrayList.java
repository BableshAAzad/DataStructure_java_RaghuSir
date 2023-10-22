package Practice;

import java.util.ArrayList;

public class DeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(0, 4);
        ar.add(2, 5);
        ar.add(1, 5);
        ar.add(3, 5);

        System.out.println(ar); //! IndexOutOfBoundsException: Index: 2, Size: 1
    }
}
