class Laptop implements Device {
    private String brand;
    private String model;
    private String procesore;

    public Laptop(String brand, String model,String procesore) {
        this.brand = brand;
        this.model = model;
        this.procesore=procesore;
    }

    @Override
    public void powerOn() {
        System.out.println( "Brand is "+brand + " \n" + "Model is: "+model + " \nlaptop is powering on.");
    }

    @Override
    public void powerOff() {
        System.out.println(" laptop is powering Off.\n");
    }
    public void processoreInfo() {
        System.out.println("\nLaptop Info: processore is:"+ procesore);
    }
}


