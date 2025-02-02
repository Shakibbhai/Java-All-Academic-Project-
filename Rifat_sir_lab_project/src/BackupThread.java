import java.nio.file.*;
import java.io.IOException;
public class BackupThread extends Thread {
    private final Phone_managing phoneManaging;


    public BackupThread(Phone_managing phoneManaging) {
        this.phoneManaging = phoneManaging;
    }


    @Override
    public void run() {

        while (true) {
            try {
                sleep(100); // Backup every 100 millisecond (adjust as needed)
                System.out.println("Performing backup...");

                // Use java.nio.file to write to a file
                Path filePath = Paths.get("D:\\New folder\\for_thread.txt");
                Files.write(filePath, phoneManaging.getContactsAsStringList(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
