public class FurnitureMainShop {
    private final Chair chair;
    private final Table table;
    private final Sofa sofa;

    public FurnitureMainShop(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.table = factory.createTable();
        this.sofa = factory.createSofa();
    }

    public void describeFurniture() {
        chair.sitOn();
        table.use();
        sofa.lieOn();
    }

    public static void main(String[] args) {

        ModernFurnitureFactory factory = ModernFurnitureFactory.getInstance();

        // Creating two shops using the same factory instance
        FurnitureMainShop shop1 = new FurnitureMainShop(factory);
        FurnitureMainShop shop2 = new FurnitureMainShop(factory);

        System.out.println("Modern Furniture Set 1:");
        shop1.describeFurniture();

        System.out.println("\nModern Furniture Set 2:");
        shop2.describeFurniture();
    }
}