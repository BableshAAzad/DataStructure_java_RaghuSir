package UtilFunctionPackage.ConsumerInterface.MethodRefranceOperator;

import java.util.*;
import java.util.function.Consumer;

public class MethodRefranceDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(45);
        values.add(65);
        values.add(89);
        values.add(58);
        values.add(38);
    // System.out.println(values);
    /**  Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                Area.circleArea(t);
            }
        };
        for (Integer value : values) {
            con.accept(value);
        }
    */
    // values.forEach(x->Area.circleArea(x));
    values.forEach(Area::circleArea);
    // values.forEach(System.out::println);
    }
    /**
     * Output: 
     *   45 radius circle area is 6362.549999999999
     *   65 radius circle area is 13274.949999999999
     *   89 radius circle area is 24887.782
     *   58 radius circle area is 10569.688
     *  38 radius circle area is 4537.048
     */
}
