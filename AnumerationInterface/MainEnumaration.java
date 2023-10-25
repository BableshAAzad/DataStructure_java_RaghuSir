package AnumerationInterface;

import java.util.Enumeration;
import java.util.Vector;

public class MainEnumaration {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Bablesh");
        v.add("Kumar");
        v.add("AAzad");
        v.add("Durgesh");
        v.add("Sharad");
        v.add("Ashwani");
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
