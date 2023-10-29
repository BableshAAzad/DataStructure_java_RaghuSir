package UtilFunctionPackage.SupplierInterface;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {
    public static void main(String[] args) {
        Supplier<Integer> sp = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(6);
            }
        };
        System.out.println(sp.get()); //*  return random ranumber within 6 eg : 1, 0, 5 etc.
        //!------------------------------------------------------------------
        Supplier<Integer> sp1 = ()-> new Random().nextInt(6);
        System.out.println(sp1.get());
        //!------------------------------------------------------------------
        Random rd = new Random();
        Supplier<Integer> sp2 = rd::nextInt;
        System.out.println(sp2.get());
    }
}
