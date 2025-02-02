public class LibraryAccessProxy implements LibraryAccess {
    private RealLibraryAccess realLibraryAccess = new RealLibraryAccess();

    @Override
    public boolean accessItem(String itemID, User user) {
        if (user.isPremium()) {
            System.out.println(user.getName() + " is accessing item: " + itemID);
            realLibraryAccess.accessItem(itemID, user);
            return true; // Access granted
        } else {
            System.out.println("Access denied for user: " + user.getName());
            return false; // Access denied
        }
    }
}
