// Concrete Electronic product class
class Electronic extends Product {
    private int storageCapacity;
    private int batteryLife;

    // Constructor for cloning
    public Electronic(Electronic source) {
        super(source);
        if (source != null) {
            this.storageCapacity = source.storageCapacity;
            this.batteryLife = source.batteryLife;
        }
    }

    @Override
    public Product clone() {
        return new Electronic(this);
    }

    // Getters and Setters for storageCapacity and batteryLife
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}