package AggregationAndComposition.Demo;

public class MainRunner {
    public static void main(String[] args) {
        Address ad1 = new Address("Banglore", "Karnataka", "India");
        Address ad2 = new Address("ChitraDurga", "Karnataka", "India");

        Employee e1 = new Employee(123, "Bablesh", 321, ad1);
        Employee e2 = new Employee(124, "Kumar", 421, ad2);
        Employee e3 = new Employee(125, "AAzad", 521, ad2);
        Employee e4 = new Employee(126, "Durgesh", 621, ad2);
        Employee e5 = new Employee(127, "Sharad", 721, ad1);
        e2 = null;
        Employee e6 = new Employee(128, "Bhoopend", 821, null);
        System.out.println(ad1);
        System.out.println(ad2);
        System.out.println("-----------------------------------------------------------");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);

    }
}
