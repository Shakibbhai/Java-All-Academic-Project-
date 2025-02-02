public class Main {
    public static void main(String[] args) {
        ProductRegistry registry = new ProductRegistry();

        // Create initial product prototypes
        Clothing shirt = new Clothing(null);
        shirt.setName("T--Shirt");
        shirt.setCategory("Clothing");
        shirt.setPrice(30);
        shirt.setColor("Black");
        shirt.setSize("M");

        Electronic smartphone = new Electronic(null);
        smartphone.setName("Smartphone Realme c11");
        smartphone.setCategory("Electronics");
        smartphone.setPrice(100000);
        smartphone.setStorageCapacity(128);
        smartphone.setBatteryLife(24);

        // Register prototypes
        registry.addPrototype("basicShirt", shirt);
        registry.addPrototype("smartphoneX", smartphone);

        // Clone products
        Product clonedShirt = registry.getPrototype("basicShirt");
        Product clonedSmartphone = registry.getPrototype("smartphoneX");

        // Customizing cloned products
        if (clonedShirt instanceof Clothing) {
            ((Clothing) clonedShirt).setColor("White");
        }
        if (clonedSmartphone instanceof Electronic) {
            ((Electronic) clonedSmartphone).setStorageCapacity(256);
        }
        if (clonedShirt instanceof Clothing) {
            ((Clothing) clonedShirt).setSize("XL");
        }

        // Display cloned products with slight customizations
        System.out.println("Original Shirt: " + shirt.getColor()+"\nsize is: "+shirt.getSize());
        System.out.println("Cloned Shirt with Custom Color: " + ((Clothing) clonedShirt).getColor()+"\nclone size is: "+((Clothing) clonedShirt).getSize());

        System.out.println("Original Smartphone Storage: " + smartphone.getStorageCapacity());
        System.out.println("Cloned Smartphone with Custom Storage: " + ((Electronic) clonedSmartphone).getStorageCapacity());
    }
}