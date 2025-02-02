public class Product<T> {
    private final String name;
    private final double  price;
    private final T quantity;

    public Product(String name, double price, T quantity) throws NegativeQuantityException {
        if (quantity instanceof Integer && (Integer) quantity < 0) {
            throw new NegativeQuantityException("Quantity cannot be negative.");
        } else if (quantity instanceof Double && (Double) quantity < 0) {
            throw new NegativeQuantityException("Quantity cannot be negative.");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getQuantity() {
        return quantity;
    }
}