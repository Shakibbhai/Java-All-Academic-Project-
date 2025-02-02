class ModernFurnitureFactory implements FurnitureFactory {
    private static ModernFurnitureFactory instance;
    private static int counter = 0;

    private ModernFurnitureFactory() {
    }

    public static synchronized ModernFurnitureFactory getInstance() {
        if (instance == null) {
            instance = new ModernFurnitureFactory();
        }
        return instance;
    }

    // Method to generate a unique ID
    private synchronized int generateId() {
        return ++counter;
    }

    public Chair createChair() {
        return new ModernChair(generateId());
    }

    @Override
    public Table createTable() {
        return new ModernTable(generateId());
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa(generateId());
    }
}