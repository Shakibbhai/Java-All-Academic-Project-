public class Main {
    public static void main(String[] args) {
        // Client inputs essential details
        String cardNumber = "1234-5678-9012-3456"; // Test with a valid account
        int securityPin = 1239;
        double accountBalance = 500.0;
        double paymentAmount = 50.0;

        // Create a PaymentFacade instance
        PaymentFacade paymentFacade = new PaymentFacade(cardNumber, securityPin, accountBalance);

        // Attempt to make payment
        System.out.println("Attempting to make payment...");
        boolean success = paymentFacade.makePayment(paymentAmount);


        if (success) {
            System.out.println("Payment successful. Enjoy your pizza!");
        } else {
            System.out.println("Payment failed. Please try again.");
        }
    }
}
