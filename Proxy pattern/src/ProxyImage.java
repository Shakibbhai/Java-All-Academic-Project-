class ProxyImage implements Image {
    private RealImage realImage;  // RealImage object, will be created when needed
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    // Only loads and displays the image when required
    public void display() {
        // Only load the real image if it hasn't been loaded yet
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display(); // Delegate to the real image to display it
    }
}
