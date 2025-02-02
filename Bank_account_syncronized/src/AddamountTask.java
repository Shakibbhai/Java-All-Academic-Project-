public class AddamountTask implements Runnable {
    Account acc;

    public AddamountTask(Account acc) {

        this.acc = acc;
    }

    public void run() {
        acc.deposit(100);
        acc.withdraw(200);
    }
}
