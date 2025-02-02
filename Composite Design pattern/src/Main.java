public class Main {
    public static void main(String[] args) {
        // Create Files
        File file1 = new File("file1.txt", "This is a test file.");
        File file2 = new File("file2.txt", " test file with some data.");
        File file3 = new File("file3.txt", "Keyword is present here.");

        // Create Folders
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Compose structure
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        folder2.addComponent(file3);
        folder2.addComponent(folder1);


        System.out.println("Searching for 'Keyword':");
        folder2.search("Keyword");
        System.out.print("\n");

        System.out.println("Searching for 'Keyword':");
        file1.search("is");

        System.out.print("\n");


        System.out.println("\nSearching for 'test':");
        folder1.search("test");
    }
}