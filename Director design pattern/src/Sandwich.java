class Sandwich {
    private String bread;
    private String filling;
    private String spread;

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    @Override
    public String toString() {
        return "Sandwich [Bread: " + bread + ", Filling: " + filling + ", Spread: " + spread + "]";
    }
}
