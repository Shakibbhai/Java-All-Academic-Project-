
import java.util.*;

class ShoppingCart {
    Map<Product, Integer> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addItem(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeItem(Product product, int quantity) {
        int currentQuantity = items.getOrDefault(product, 0);
        if (currentQuantity <= quantity) {
            items.remove(product);
        } else {
            items.put(product, currentQuantity - quantity);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().price * entry.getValue();
        }
        return total;
    }

    public Map<Product, Integer> getItems() {
        return items;
    }
}