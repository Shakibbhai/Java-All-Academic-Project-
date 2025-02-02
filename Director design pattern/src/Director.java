class Director {
    public void constructChickenSandwich(SandwichBuilder builder) {
        builder.reset();
        builder.setBread("Regular Bread");
        builder.setFilling("Grilled Chicken");
        builder.setSpread("Cheese");
    }

    public void constructEggSandwich(SandwichBuilder builder) {
        builder.reset();
        builder.setBread("Toasted Bread");
        builder.setFilling("Fried Egg");
        builder.setSpread("Sauce");
    }

    public void constructCustomSandwich(SandwichBuilder builder, String bread, String filling, String spread) {
        builder.reset();
        builder.setBread(bread);
        builder.setFilling(filling);
        builder.setSpread(spread);
    }
}