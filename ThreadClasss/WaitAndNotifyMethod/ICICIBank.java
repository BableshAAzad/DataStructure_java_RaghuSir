package ThreadClasss.WaitAndNotifyMethod;

public class ICICIBank implements Bank {
    int balance;

    ICICIBank(int balance) {
        this.balance = balance;
    }

    @Override
    synchronized public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposite sucessfully: " + amount);
        checkBalance();
        notify();
    }

    @Override
    synchronized public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Low Balance.............");
            try {
                wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            withdraw(amount);
            return;
        }
        balance = balance - amount;
        System.out.println("Withdraw successfully : " + amount);
        checkBalance();
    }

    @Override
    synchronized public void checkBalance() {
        System.out.println("Available balance : " + balance);
    }
}
