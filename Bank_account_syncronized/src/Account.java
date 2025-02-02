//import static java.lang.Thread.sleep;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double balance;
    private int withaw;
    private final Lock lo = new ReentrantLock();


    public Account(double balance)
    {
        this.balance = balance;
    }

    public double getBalance() {

        return balance;
    }

    public synchronized void deposit(double amount) {
        lo.lock();
        String name = Thread.currentThread().getName();
        System.out.println(name + " deposit the :$" + amount);
        double newbalance = balance + amount;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            balance = newbalance;
            System.out.println("Now balance is:" + newbalance);
            System.out.println("\n");

            lo.unlock();
        }

    }

    public synchronized void withdraw(double amount) {
        String name = Thread.currentThread().getName();


        if (withaw <= balance) {
            System.out.println(name + " withdraw: $" + amount);
            balance -= amount;
            System.out.println("Now balance is:" + balance);
            System.out.println("\n");
        } else {
            System.out.println("insufficient balance.");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
