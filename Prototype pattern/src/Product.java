// Abstract Product class with core attributes and a clone method
abstract class Product implements Cloneable {
    protected String name;
    protected String category;
    protected double price;

    // Default constructor
    public Product() {}

    // Prototype constructor for cloning
    public Product(Product source) {
        if (source != null) {
            this.name = source.name;
            this.category = source.category;
            this.price = source.price;
        }
    }

    // Abstract method to be implemented for cloning
    public abstract Product clone();

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}