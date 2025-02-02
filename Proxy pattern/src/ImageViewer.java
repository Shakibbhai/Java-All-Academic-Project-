import java.util.ArrayList;
import java.util.List;

class ImageViewer {
    private List<Image> images;

    public ImageViewer() {
        images = new ArrayList<>();
    }

    // Add a new image to the list (this will add a ProxyImage for efficiency)
    public void addImage(String filename) {
        images.add(new ProxyImage(filename));
    }

    // Display all images, loading them only when requested
    public void displayImages() {
        for (int i = 0; i < images.size(); i++) {
            System.out.println("Image " + (i + 1) + ":");
            images.get(i).display();
        }
    }
}
