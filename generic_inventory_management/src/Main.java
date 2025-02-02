import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            InventoryManager<Integer> intInventory = new InventoryManager<>();
            InventoryManager<Double> doubleInventory = new InventoryManager<>();

            // Example: Adding products to inventories
            Product<Integer> laptop = new Product<>("Laptop", 1200.00, 9);
            Product<Double> smartphone = new Product<>("Smartphone", 699.99, 10.5);
            Product<Integer> monitor = new Product<>("Monitor", 300.00, 8);
            Product<Double> tablet = new Product<>("Tablet", 499.99, 7.5);

            intInventory.addProduct(laptop);
            doubleInventory.addProduct(smartphone);
            intInventory.addProduct(monitor);
            doubleInventory.addProduct(tablet);

            // Example: Sorting products based on price
            Comparator<Product<Integer>> priceComparator = Comparator.comparing(Product::getPrice);
            intInventory.sortProducts(priceComparator);

            Comparator<Product<Double>> nameLengthComparator = Comparator.comparing(p -> p.getName().length());
            doubleInventory.sortProducts(nameLengthComparator);

            // Example: Removing a product from inventory
            intInventory.removeProduct(laptop);

            // Example: Displaying products in the inventory
            System.out.println("Integer Inventory Products:");
            for (Product<Integer> product : intInventory.getProducts()) {
                System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() +
                        ", Quantity: " + product.getQuantity());
            }

            System.out.println("\nDouble Inventory Products:");
            for (Product<Double> product : doubleInventory.getProducts()) {
                System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() +
                        ", Quantity: " + product.getQuantity());
            }

        } catch (Exception e) {
            // Handle exceptions
            handleException(e);
        }
    }

    // Global exception handling (if needed)
    private static void handleException(Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
        // Log the exception or perform other error-handling actions
    }
}