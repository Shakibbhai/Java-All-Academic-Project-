class SmartphoneFactory extends DeviceFactory {
    @Override
    public Device createDevice(String brand, String model,String ob) {
        String display=(String)ob;
        return new Smartphone(brand, model,display);
    }
}