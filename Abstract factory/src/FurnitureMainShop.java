//client code
//. Once the constructor completes, the fields cannot be modified,
public class FurnitureMainShop {
    private  Chair chair;
    private Table table;
    private  Sofa sofa;

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
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureMainShop modernStore = new FurnitureMainShop(modernFactory);
        System.out.println("Modern Furniture:");
        modernStore.describeFurniture();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureMainShop victorianStore = new FurnitureMainShop(victorianFactory);
        System.out.println("\nVictorian Furniture:");
        victorianStore.describeFurniture();

        FurnitureFactory rusticFactory = new RusticFurnitureFactory();
        FurnitureMainShop rusticStore = new FurnitureMainShop(rusticFactory);
        System.out.println("\nRustic Furniture:");
        rusticStore.describeFurniture();
    }
}