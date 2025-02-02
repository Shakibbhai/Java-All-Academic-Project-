interface SandwichBuilder {
    void reset();
    void setBread(String bread);
    void setFilling(String filling);
    void setSpread(String spread);
    Sandwich getProduct();
}