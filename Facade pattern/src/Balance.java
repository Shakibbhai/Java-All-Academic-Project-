class Balance {
    private double balance;

    public Balance(double balance) {
        this.balance = balance;
    }

    public boolean hasSufficientBalance(double amount) {
        System.out.println("Checking if sufficient balance is available.");
        return balance >= amount;
    }

    public void deductAmount(double amount) {
        balance -= amount;
        System.out.println("Amount deducted. Remaining balance: $" + balance);
    }
}