class Account {
    private String cardNumber;

    public Account(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean validateAccount(AccountChecker accountChecker) {
        System.out.println("Validating account for card number: " + cardNumber);
        return accountChecker.isAccountValid(cardNumber);
    }
}
