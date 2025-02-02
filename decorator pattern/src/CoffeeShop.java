// Step 5: Test the Decorator Pattern
public class CoffeeShop {
    public static void main(String[] args) {
        // Start with a basic coffee
        Coffee myCoffee = new BasicCoffee();
        System.out.println(myCoffee.getDescription() + " - $" + myCoffee.getCost());

        // Add milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " - $" + myCoffee.getCost());

        // Add sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " - $" + myCoffee.getCost());

        // Add whipped cream
        myCoffee = new WhippedCreamDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " - $" + myCoffee.getCost());
    }
}