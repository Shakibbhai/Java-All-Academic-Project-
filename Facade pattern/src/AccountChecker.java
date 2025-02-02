class AccountChecker {
    // Simulated list of valid card numbers
    private static final String[] VALID_ACCOUNTS = {
            "1234-5678-9012-3456",
            "2345-6789-0123-4567",
            "3456-7890-1234-5678"
    };

    public boolean isAccountValid(String cardNumber) {
        for (String validCard : VALID_ACCOUNTS) {
            if (validCard.equals(cardNumber)) {
                return true;
            }
        }
        System.out.println("Invalid account: Card number not found.");
        return false;
    }
}