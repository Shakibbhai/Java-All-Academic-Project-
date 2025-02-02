class Smartphone implements Device {
    private String brand;
    private String model;
    private String display;

    public Smartphone(String brand, String model,String display) {
        this.brand = brand;
        this.model = model;
        this.display=display;
    }

    @Override
    public void powerOn() {
        System.out.println( "Brand is "+brand + " \n " + "Model is: "+model + "\n Smartphone is powering on.");
    }

    @Override
    public void powerOff() {
        System.out.println("  Smartphone is powering off.\n");
    }
    public void displayInfo() {
        System.out.println("\nSmartphone Info: display is:"+ display);
    }
}