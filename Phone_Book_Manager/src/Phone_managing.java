import java.util.*;
import java.util.List;
public class Phone_managing implements phonebook_managing{
    private List<Contact> contact;

    public Phone_managing() {
        contact = FileHandler.readContactsFromFile();
    }

    public void addContact(Scanner sc) {
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        Contact c1 = new Contact(firstName, lastName, email);
        contact.add(c1);
        FileHandler.writeContactsToFile(contact);
        System.out.println("Contact added: " + c1);
    }
    public void updateContact(Scanner sc){
            System.out.print("Enter the email of the contact to update: ");
            String email = sc.nextLine();
        boolean contactFound = false;
            for(Contact call:contact) {
                if (call.getEmail_id().equals(email)) {
                    System.out.println("Enter the new FirstName:");
                    String firstnam = sc.nextLine();
                    call.setFirstName(firstnam);

                    System.out.println("Enter the new LastName:");
                    String lastnam = sc.nextLine();
                    call.setLastName(lastnam);

                    System.out.println("Do you want to change the email? (yes/no): ");
                    String changeEmailChoice = sc.nextLine();

                    if (changeEmailChoice.equalsIgnoreCase("yes")) {
                        System.out.println("Enter the new Email ID:");
                        String newEmail = sc.nextLine();
                        call.setEmail_id(newEmail);
                    }

                    System.out.println("Contact updated: " + contact);
                    contactFound=true;

                }
            }
        if (!contactFound) {
            System.out.println("Contact not found. Please try again.");
        }else {
            FileHandler.writeContactsToFile(contact);
        }
    }
//@Override
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
                FileHandler.writeContactsToFile(contact);
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


    public void managePhoneBook() {
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
                switch (choice) {
                    case 1:addContact(sc);
                    break;
                    case 2:updateContact(sc);
                    break;
                    case 3:deleteAccount(sc);
                    break;
                    case 4:viewContacts();
                    break;
                    case 5:FileHandler.writeContactsToFile(contact);
                        System.out.println("Exiting Phonebook Manager");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }

                }
            }

}
