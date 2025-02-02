class Clothing extends Product {
    private String color;
    private String size;

    // Constructor for cloning
    public Clothing(Clothing source) {
        super(source);
        if (source != null) {
            this.color = source.color;
            this.size = source.size;
        }
    }

    @Override
    public Product clone() {
        return new Clothing(this);
    }

    // Getters and Setters for color and size
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}






// Application demonstrating the Prototype pattern in a product catalog
