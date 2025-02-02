// Concrete Builder for Sandwich
class SandwichConcreteBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    public SandwichConcreteBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void setBread(String bread) {
        sandwich.setBread(bread);
    }

    @Override
    public void setFilling(String filling) {
        sandwich.setFilling(filling);
    }

    @Override
    public void setSpread(String spread) {
        sandwich.setSpread(spread);
    }

    @Override
    public Sandwich getProduct() {
        Sandwich product = this.sandwich;
        this.reset();
        return product;
    }
}
