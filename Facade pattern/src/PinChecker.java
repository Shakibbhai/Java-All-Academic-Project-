class PinChecker {
    private static final int VALID_PIN = 1234;

    public boolean isPinValid(int pin) {
        if (pin == VALID_PIN) {
            return true;
        } else {
            System.out.println("Invalid PIN.");
            return false;
        }
    }
}