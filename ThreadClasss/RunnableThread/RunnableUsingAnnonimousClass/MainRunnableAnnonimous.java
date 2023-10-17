package ThreadClasss.RunnableThread.RunnableUsingAnnonimousClass;

public class MainRunnableAnnonimous {
    public static void main(String[] args) {
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
        Thread t1 = new Thread(r);
        t1.setName("Java");
        // Tread t1 = new Tread (r, "Java");
        Thread t2 = new Thread(r);
        t2.setName("Python");
        // Tread t2 = new Tread (r, "Python");
        t1.start();
        t2.start();
    }
}
