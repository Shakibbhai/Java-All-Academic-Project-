public class RealLibraryAccess implements LibraryAccess {
    @Override
    public boolean accessItem(String itemID, User user) {
        System.out.println(user.getName() + " is granted access to item: " + itemID);
        return true;
    }
}
