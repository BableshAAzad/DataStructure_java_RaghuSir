package ThreadClasss.RunnableThread.ThrouwsExeceptionEx;

public class MainRunnable {
    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };
        Thread t1 = new Thread(r, "Java");
        Thread t2 = new Thread(r, "Python");
        Thread t3 = new Thread(r, "golang");
        t1.start();
        t1.join();
        t2.start();
        t2.join(50);
        t3.start();
    }
}
