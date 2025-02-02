import java.io.File;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        File s=new File("D:\\New folder\\booki.txt");
        Library lib=new Library(s);
        //lib.readfilefrom(s);
        Scanner a =new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add a book ");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            choice = Integer.parseInt(a.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter title: ");
                    String title = a.nextLine();
                    System.out.println("Enter author: ");
                    String author = a.nextLine();
                    System.out.println("Enter ISBN: ");
                    String ISBN = a.nextLine();
                    Book book3 = new Book(title, author, ISBN);
                    lib.addBook(book3);
                    break;
                case 2:
                    System.out.println("Enter the details of the book to be removed:");
                    System.out.print("Enter title: ");
                    String removeTitle = a.nextLine();
                    System.out.print("Enter author: ");
                    String removeAuthor = a.nextLine();
                    System.out.print("Enter ISBN: ");
                    String removeISBN = a.nextLine();

                    Book book4 = new Book(removeTitle, removeAuthor, removeISBN);
                    lib.removeBook(book4);
                    break;
                case 3:
                    lib.DisplayBook();
                    break;
                case 4:
                    //lib.writefile(file);// Save all books before exiting
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }while(choice!=4);





    }
}