// Step 3: Create an abstract CoffeeDecorator class that implements Coffee
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // The component to be decorated

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription(); // Delegates the call
    }

    @Override
    public double getCost() {
        return coffee.getCost(); // Delegates the call
    }
}
