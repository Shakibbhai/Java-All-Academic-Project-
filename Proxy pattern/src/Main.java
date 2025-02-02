import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ImageViewer viewer = new ImageViewer();

        // Adding some images (note these are proxy objects initially)
        viewer.addImage("photo1_highres.jpg");
        viewer.addImage("photo2_highres.jpg");
        viewer.addImage("photo3_highres.jpg");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. View all images");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                // Display all images
                viewer.displayImages();
            } else if (choice == 2) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
