class LaptopFactory extends DeviceFactory {
    @Override
    public Device createDevice(String brand, String model,String process) {
        String processories =(String) process;
        return new Laptop(brand, model,processories);
    }
}