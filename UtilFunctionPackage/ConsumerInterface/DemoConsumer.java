package UtilFunctionPackage.ConsumerInterface;

import java.util.PriorityQueue;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Bablesh");
        pq.add("Kumar");
        pq.add("AAzad");
        pq.add("Durgesh");
        pq.add("Kajol");
        pq.add("Lalita");
        System.out.println(pq);
        Consumer<String> cons = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println("Mr/Ms.: " + t);
            }
        };
        // pq.forEach(cons);
        for (String s : pq) {
            cons.accept(s);
        }
    }
    /*
     * Output :
     * [AAzad, Durgesh, Bablesh, Kumar, Kajol, Lalita]
     * Mr/Ms.: AAzad
     * Mr/Ms.: Durgesh
     * Mr/Ms.: Bablesh
     * Mr/Ms.: Kumar
     * Mr/Ms.: Kajol
     * Mr/Ms.: Lalita
     */
}
