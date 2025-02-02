class ModernSofa implements Sofa {
    private final int id;

    public ModernSofa(int id) {
        this.id = id;
    }

    @Override
    public void lieOn() {
        System.out.println("Sitting on a modern sofa with ID: " + id);
    }

    @Override
    public int getId() {
        return id;
    }
}