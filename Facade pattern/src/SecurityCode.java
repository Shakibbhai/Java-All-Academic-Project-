class SecurityCode {
    private int pin;

    public SecurityCode(int pin) {
        this.pin = pin;
    }

    public boolean validatePin(PinChecker pinChecker) {
        System.out.println("Validating PIN: " + pin);
        return pinChecker.isPinValid(pin);
    }
}