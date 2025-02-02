class PaymentFacade {
    private Account account;
    private SecurityCode securityCode;
    private Balance balance;
    private Ledger ledger;
    private Notification notification;

    public PaymentFacade(String cardNumber, int pin, double currentBalance) {
        this.account = new Account(cardNumber);
        this.securityCode = new SecurityCode(pin);
        this.balance = new Balance(currentBalance);
        this.ledger = new Ledger();
        this.notification = new Notification();
    }

    public boolean makePayment(double amount) {
        System.out.println("Starting payment process...");

        AccountChecker accountChecker = new AccountChecker();
        if (!account.validateAccount(accountChecker)) {
            return false;
        }

        PinChecker pinChecker = new PinChecker();
        if (!securityCode.validatePin(pinChecker)) {
            return false;
        }

        if (!balance.hasSufficientBalance(amount)) {
            System.out.println("Insufficient balance.");
            return false;
        }

        balance.deductAmount(amount);
        ledger.makeEntry(account.toString(), amount);
        notification.sendNotification("Payment of $" + amount + " was successful.");

        System.out.println("Payment completed.");
        return true;
    }
}