// Step 2: Create a concrete implementation of Coffee
class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 2.00; // Base price of the coffee
    }
}
