class ModernChair implements Chair {
    private final int id;

    public ModernChair(int id) {
        this.id = id;
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair with ID: " + id);
    }

    @Override
    public int getId() {
        return id;
    }
}