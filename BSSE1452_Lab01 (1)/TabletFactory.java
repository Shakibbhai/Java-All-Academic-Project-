class TabletFactory extends DeviceFactory {
    @Override
    public Device createDevice(String brand, String model,String ob) {
        String battery=(String)ob;
        return new Tablet(brand, model,battery);
    }
}