package UtilFunctionPackage.SupplierInterface;

import java.util.function.Supplier;

public class MathRandomNumber {
    public static void main(String[] args) {
        Supplier<Double> getRandomDouble = () -> Math.random();
        System.out.println(getRandomDouble.get());
    }
}
