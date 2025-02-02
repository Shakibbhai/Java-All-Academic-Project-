import java.util.*;
import java.io.*;
import java.util.List;
public class FileHandler {
    private static final File FILENAME = new File("D:\\New folder\\phone_manager.txt");

    public static List<Contact> readContactsFromFile() {
        List<Contact> contacts = new ArrayList<>();

        try {
            BufferedReader buff = new BufferedReader(new FileReader(FILENAME));
            String s1;
            while ((s1 = buff.readLine()) != null) {
                String[] divide = s1.split(",");
                if (divide.length == 3) {
                    Contact c6 = new Contact(divide[0], divide[1], divide[2]);
                    contacts.add(c6);
                }
            }
        } catch (FileNotFoundException e) {
            // File doesn't exist yet, ignore
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contacts;
    }

    public static void writeContactsToFile(List<Contact> contacts) {
        try (BufferedWriter buff = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Contact c8 : contacts) {
                buff.write(c8.getFirstName() + "," + c8.getLastName() + "," + c8.getEmail_id() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}