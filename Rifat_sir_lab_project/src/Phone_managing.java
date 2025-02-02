import java.util.*;
import java.util.List;
public class Phone_managing implements phonebook_managing{
    private final List<Contact> contact;
    FileHandler fileHandler=new FileHandler();
    enum PhoneBookOption {
        ADD_CONTACT,
        UPDATE_CONTACT,
        DELETE_CONTACT,
        VIEW_CONTACTS,
        EXIT
    }


    public Phone_managing() {
        contact = fileHandler.readContactsFromFile();
    }

    public List<String> getContactsAsStringList() {
        List<String> contactsAsStringList = new ArrayList<>();
        for (Contact contact : contact) {
            String contactString = contact.getFirstName() + "," + contact.getLastName() + "," + contact.getEmail_id() + "," + contact.getPhoneNumber();
            contactsAsStringList.add(contactString);
        }
        return contactsAsStringList;
    }

    public void startBackupThread() {
        BackupThread backupThread = new BackupThread(this);
        backupThread.start();
    }

    public void addContact(Scanner sc) {
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        Contact c1 = new Contact(firstName, lastName, email, phoneNumber);
        contact.add(c1);
        fileHandler.writeContactsToFile(contact);
        System.out.println("Contact added: " + c1);
    }

    public void updateContact(Scanner sc) {
        System.out.print("Enter the email of the contact to update: ");
        String email = sc.nextLine();
        boolean contactFound = false;

        for (Contact call : contact) {
            if (call.getEmail_id().equals(email)) {
                System.out.println("Enter the new FirstName:");
                String firstname = sc.nextLine();
                call.setFirstName(firstname);

                System.out.println("Enter the new LastName:");
                String lastname = sc.nextLine();
                call.setLastName(lastname);

                System.out.println("Enter the new Phone Number:");
                String newPhoneNumber = sc.nextLine();
                call.setPhoneNumber(newPhoneNumber);

                System.out.println("Do you want to change the email? (yes/no): ");
                String changeEmailChoice = sc.nextLine();

                if (changeEmailChoice.equalsIgnoreCase("yes")) {
                    System.out.println("Enter the new Email ID:");
                    String newEmail = sc.nextLine();
                    call.setEmail_id(newEmail);
                }

                System.out.println("Contact updated: " + call);
                contactFound = true;
            }
        }

        if (!contactFound) {
            System.out.println("Contact not found. Please try again.");
        } else {
            fileHandler.writeContactsToFile(contact);
        }
    }

    public void deleteAccount(Scanner sc){
        System.out.print("Enter the email of the contact to delete: ");
        String email = sc.nextLine();
        Contact contactRemoved =null;

        for(Contact c3:contact){
            if(c3.getEmail_id().equals(email)){
                contactRemoved=c3;
                break;

            }}
        if(contactRemoved!=null){
            contact.remove(contactRemoved);
            System.out.println("Contact deleted: " + contactRemoved);
            fileHandler.writeContactsToFile(contact);
        }else{
            System.out.println("Contact not found.");
        }

    }
    public void viewContacts() {
        if (contact.isEmpty()) {
            System.out.println("Phonebook is empty.");
        } else {
            System.out.println("Phonebook Contacts:");
            for (Contact contact5 : contact) {
                System.out.println(contact5);
            }
        }
    }


     void managePhoneBook() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Phonebook Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. View All Contacts");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            PhoneBookOption selectedOption = getOption(choice);

            switch (selectedOption) {
                case ADD_CONTACT:
                    addContact(sc);
                    break;
                case UPDATE_CONTACT:
                    updateContact(sc);
                    break;
                case DELETE_CONTACT:
                    deleteAccount(sc);
                    break;
                case VIEW_CONTACTS:
                    viewContacts();
                    break;
                case EXIT:
                    fileHandler.writeContactsToFile(contact);
                    System.out.println("Exiting Phonebook Manager");
                    System.exit(0);
                case null:
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private PhoneBookOption getOption(int choice) {
        // Convert the user's choice to the corresponding enum constant
        switch (choice) {
            case 1 -> {
                return PhoneBookOption.ADD_CONTACT;
            }
            case 2 -> {
                return PhoneBookOption.UPDATE_CONTACT;
            }
            case 3 -> {
                return PhoneBookOption.DELETE_CONTACT;
            }
            case 4 -> {
                return PhoneBookOption.VIEW_CONTACTS;
            }
            case 5 -> {
                return PhoneBookOption.EXIT;
            }
            default -> {
                return null;
            }
        }
    }

}
