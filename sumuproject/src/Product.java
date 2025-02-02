
class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void decreaseStock(int quantity) {
        stock -= quantity;
    }

    public int getStock() {
        return stock;
    }
}