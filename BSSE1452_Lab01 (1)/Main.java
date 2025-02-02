public class Main {
    public static void main(String[] args) {
        // Create factories
        DeviceFactory smartphoneFactory = new SmartphoneFactory();
        DeviceFactory tabletFactory = new TabletFactory();
        DeviceFactory laptopFactory = new LaptopFactory();

        // Smartphone
        Device smartphone = smartphoneFactory.createDevice(" Realme chineese company", "Realme 10 + pro","6.1 inch");
        smartphone.powerOn();
        ((Smartphone) smartphone).displayInfo();
        smartphone.powerOff();

        // tablet
        Device tablet = tabletFactory.createDevice("walton", "walton tablet ","10000 mah");
        tablet.powerOn();
        ((Tablet) tablet).batteryInfo();
        tablet.powerOff();

        // Laptop
        Device laptop = laptopFactory.createDevice("Hp", " hp pavilion 14dv","intel");
        laptop.powerOn();
        ((Laptop) laptop).processoreInfo();
        laptop.powerOff();
    }
}
