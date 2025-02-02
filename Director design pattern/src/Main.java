import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director = new Director();
        SandwichBuilder builder = new SandwichConcreteBuilder();

        while (true) {
            System.out.println("\nWelcome to the Sandwich Shop! Please choose an option:");
            System.out.println("1. Chicken Sandwich");
            System.out.println("2. Egg Sandwich");
            System.out.println("3. Custom Sandwich");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 4) {
                System.out.println("Thank you for visiting the Sandwich Shop. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    director.constructChickenSandwich(builder);
                    break;
                case 2:
                    director.constructEggSandwich(builder);
                    break;
                case 3:
                    System.out.println("Enter type of bread (e.g., Regular, Toasted): ");
                    String bread = scanner.nextLine();

                    System.out.println("Enter type of filling (e.g., Grilled Chicken, Fried Egg): ");
                    String filling = scanner.nextLine();

                    System.out.println("Enter type of spread (e.g., Cheese, Sauce): ");
                    String spread = scanner.nextLine();

                    director.constructCustomSandwich(builder, bread, filling, spread);
                    break;
                default:
                    System.out.println("Invalid choice, creating a default Chicken Sandwich.");
                    director.constructChickenSandwich(builder);
                    break;
            }

            Sandwich sandwich = builder.getProduct();
            System.out.println("Your sandwich is ready: " + sandwich);
        }

        scanner.close();
    }
}
