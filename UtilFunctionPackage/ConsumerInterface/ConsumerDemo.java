package UtilFunctionPackage.ConsumerInterface;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();
        names.add("Lalita");
        names.add("Bablesh");
        names.add("Durgesh");
        names.add("Kajol");
        names.add("AshwaniVerma");
        names.add("AnjaniKu");
        names.add("Arjun");
       /** Consumer<String> consum = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println("Mr/Ms : " + t);
            }
        };
        for (String name : names) {
            consum.accept(name);
        }
        */
        names.forEach(str -> System.out.println("Mr/Ms : " + str));
    }
    /**
     * Output :
     * Mr/Ms : AnjaniKu
     * Mr/Ms : Arjun
     * Mr/Ms : AshwaniVerma
     * Mr/Ms : Bablesh
     * Mr/Ms : Durgesh
     * Mr/Ms : Kajol
     * Mr/Ms : Lalita
     */
}
