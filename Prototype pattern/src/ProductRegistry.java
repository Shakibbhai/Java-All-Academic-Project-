import java.util.HashMap;
import java.util.Map;

// Prototype registry to store and clone product prototypes
class ProductRegistry {
    private Map<String, Product> prototypes = new HashMap<>();
    public void addPrototype(String key, Product product) {
        prototypes.put(key, product);
    }

    // Retrieves a clone of a product prototype
    public Product getPrototype(String key) {
        Product prototype = prototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }
}