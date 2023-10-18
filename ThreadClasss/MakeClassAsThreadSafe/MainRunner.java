package ThreadClasss.MakeClassAsThreadSafe;

public class MainRunner {
    public static void main(String[] args) {
        Addition a = new Addition(20, 30);
        Thread t1 = new Thread(){
            @Override
            public void run(){
                a.sum();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                a.update();
            }
        };
        t1.start();
        t2.start();
    }
}
