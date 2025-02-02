class RealImage implements Image {
    private String filename;

    // Constructor to load the image filename
    public RealImage(String filename) {
        this.filename = filename;
        loadImage();
    }

    // Simulate loading a high-resolution image
    private void loadImage() {
        System.out.println("Loading high-resolution image: " + filename);
    }

    // Display the image (simulates showing the image to the user)
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
