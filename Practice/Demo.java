package Practice;

class Demo1 {
    final void m1(){
        System.out.println("Bablesh");
    }
    private void m2(){
        System.out.println("AAzad");
    }
    static void m3(){
        System.out.println("Durgesh");
    }
}
class Demo2 extends Demo1 {
    void m(){
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
        Demo2 d2 = new Demo2();
        d2.m();
        // d2.m1();
        Demo1 d1 = new Demo1();
        // d1.m2();  // Not possible to access
    }
}
