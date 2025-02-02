public class Main {
    public static void main(String[] args) {
        // Singleton Configuration Manager
        LibraryConfigManager config = LibraryConfigManager.getInstance();
        config.setLateFee(3.0); // Updating late fee
        System.out.println("Library Configuration:");
        System.out.println("Late Fee: " + config.getLateFee() + "$");
        System.out.println("Opening Hours: " + config.getOpeningHours());
        System.out.println("Borrow Limit: " + config.getBorrowingLimit() + "\n");

        // Factory Pattern for Library Items
        LibraryItem book = LibraryItemFactory.createLibraryItem("book", "Bidrohi", "Kazi Nazrul Islam");
        LibraryItem magazine = LibraryItemFactory.createLibraryItem("magazine", "Tech Monthly", "Issue 12");

        // Proxy Pattern for Library Access
        LibraryAccess proxy = new LibraryAccessProxy();

        // Create users
        User user1 = new User("Shakib", false); // Regular user
        User user2 = new User("Kibria", true);  // Premium user

        // Attempting access for User1 and User2
        System.out.println("Attempting access for User1: " + user1.getName());
        boolean user1Access = proxy.accessItem("book-1", user1);

        if (user1Access) {
            System.out.println("\nUser1 (" + user1.getName() + ") can now borrow items:");
            System.out.println(book.getDetails());
            book.borrowItem();

            System.out.println(magazine.getDetails());
            magazine.borrowItem();
        } else {
            System.out.println("User1 (" + user1.getName() + ") is denied access.");
        }

        System.out.println("\nAttempting access for User2: " + user2.getName());
        boolean user2Access = proxy.accessItem("book-2", user2);

        if (user2Access) {
            System.out.println("\nUser2 (" + user2.getName() + ") can now borrow items:");
            System.out.println(book.getDetails());
            book.borrowItem();

            System.out.println(magazine.getDetails());
            magazine.borrowItem();
        } else {
            System.out.println("User2 (" + user2.getName() + ") is denied access.");
        }
    }
}
