import java.util.*;
class InventoryManager<T> {
    private final List<Product<T>> products;

    public InventoryManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product<T> product) throws NegativeQuantityException {
        if (product.getQuantity() instanceof Integer && (Integer) product.getQuantity() < 0) {
            throw new NegativeQuantityException("Cannot add a product with negative quantity to the inventory.");
        } else if (product.getQuantity() instanceof Double && (Double) product.getQuantity() < 0) {
            throw new NegativeQuantityException("Cannot add a product with negative quantity to the inventory.");
        }

        products.add(product);
    }

    public void removeProduct(Product<T> product) {
        products.remove(product);
    }

    public void sortProducts(Comparator<? super Product<T>> comparator) {
        products.sort(comparator);
    }

    public List<Product<T>> getProducts() {
        return Collections.unmodifiableList(products);
    }

    // Other methods for inventory management

    // Exception handling
    /*public void handleException(Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        // Log the exception or perform other error-handling actions
    }*/
}