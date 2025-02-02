import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Library implements FileOperation {
    private List<Book> books;
    private File file;

    public Library(File file) {
        this.file = file;
        this.books = new ArrayList<>();
        readfilefrom(file);
    }

    public void addBook(Book newBook) {
        books.add(newBook);
        appendBookToFile(newBook, file);
    }

    public void removeBook(Book bookToRemove) {
        books.removeIf(book -> book.getTitle().equals(bookToRemove.getTitle())
                && book.getAuthor().equals(bookToRemove.getAuthor())
                && book.getISBN().equals(bookToRemove.getISBN()));
        updateFileFromList(books, file);
    }

    public void DisplayBook() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }

    private void appendBookToFile(Book book, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getISBN() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateFileFromList(List<Book> books, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Book book : books) {
                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getISBN() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readfilefrom(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Book book = new Book(parts[0], parts[1], parts[2]);
                    books.add(book);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

