package ThreadClasss.MakeClassAsThreadSafe;

public class Addition {
    int a;
    int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    synchronized void update() {
        a = a + 10;
        b = b + 20;
    }

    synchronized void sum() {
        System.out.println("a value is : " + a);
        System.out.println("b value is : " + b);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum is : " + (a + b));
    }
}
