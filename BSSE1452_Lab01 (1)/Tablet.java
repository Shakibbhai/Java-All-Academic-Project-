class Tablet implements Device {
    private String brand;
    private String model;
    private String battery;

    public Tablet(String brand, String model,String battery) {
        this.brand = brand;
        this.model = model;
        this.battery=battery;
    }

    @Override
    public void powerOn() {
        System.out.println( "Brand is "+brand + " \n " + "Model is: "+model + " \nTablet is powering on.");
    }

    @Override
    public void powerOff() {
        System.out.println(" Tablet is powering off.\n");
    }
    public void batteryInfo() {
        System.out.println("\ntablet Info: battery is:"+ battery);
    }
}