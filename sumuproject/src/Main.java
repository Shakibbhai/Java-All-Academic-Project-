import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Main {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);
            File outputFile = new File("output.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            PrintStream printStream = new PrintStream(fileOutputStream);
            System.setOut(printStream);
            Shop shop = new Shop();
            shop.menu(scanner);
        }
        catch (Exception e) {
            System.out.println("Error reading input file\n" + e.getMessage());
            System.exit(1);
        }
    }
}