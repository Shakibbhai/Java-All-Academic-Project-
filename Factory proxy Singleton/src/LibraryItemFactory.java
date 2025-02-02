public class LibraryItemFactory {
    public static LibraryItem createLibraryItem(String type, String name, String extraInfo) {
        if (type.equalsIgnoreCase("book")) {
            return new Book(name, extraInfo); // Book has a title and an author
        } else if (type.equalsIgnoreCase("magazine")) {
            return new Magazine(name, extraInfo); // Magazine has a title and issue string (no parsing needed)
        }
        return null;
    }
}
