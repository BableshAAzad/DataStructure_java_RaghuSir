package Practice;

import java.util.HashMap;
import java.util.Map;

class Demo1 {

    Demo1() throws Exception {

    }

    final void m1() {
        System.out.println("Bablesh");
    }

    private void m2() {
        System.out.println("AAzad");
    }

    static void m3() {
        System.out.println("Durgesh");
    }
}

class Demo2 extends Demo1 {
    Demo2() throws Exception {
        super();
    }

    void m() {
        super.m1();
        super.m3();
        System.out.println("Lalita");
    }
    // @Override
    // static void m3(){

    // }
}

public class Demo {
    public static void main(String[] args) {
        // Demo2 d2 = new Demo2();
        // d2.m();
        // d2.m1();
        // Demo1 d1 = new Demo1();
        // d1.m2(); // Not possible to access
        // ^ --------------------------------------------
        HashMap
        System.out.println("hi");
        try {
            System.out.println(10 / 0);
        } 
        catch (Throwable e) {
            e.printStackTrace();
        }
         finally {
            // System.out.println(10 / 0);
        }
        System.out.println("Hi");
    }
}
