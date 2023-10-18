package ThreadClasss.WaitAndNotifyMethod;

public class MainBank {
    public static void main(String[] args) throws InterruptedException {
        Bank icici = new ICICIBank(5000);
        Thread wt = new Thread() {
            @Override
            public void run() {
                icici.withdraw(13000);
            }
        };
        Thread dt1 = new Thread() {
            @Override
            public void run() {
                icici.withdraw(5000);
            }
        };
        Thread dt2 = new Thread() {
            @Override
            public void run() {
                icici.withdraw(5000);
            }
        };
        wt.start();
        Thread.sleep(10000);
        dt1.start();
        Thread.sleep(10000);
        dt2.start();
    }
}
