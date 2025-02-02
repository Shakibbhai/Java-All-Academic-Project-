class ModernTable implements Table {
    private final int id;

    public ModernTable(int id) {
        this.id = id;
    }

    public void use() {
        System.out.println("Sitting on a modern Table with ID: " + id);
    }

    @Override
    public int getId() {
        return id;
    }
}