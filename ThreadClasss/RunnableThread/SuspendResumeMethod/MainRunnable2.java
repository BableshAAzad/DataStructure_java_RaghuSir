package ThreadClasss.RunnableThread.SuspendResumeMethod;

public class MainRunnable2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t1 = new Thread(r, "Jspider");
        t1.start();
        Thread.sleep(600);
        t1.suspend();
        Thread.sleep(10000);
        t1.resume();
    }
}
