public class BookFactory implements LibraryItemFactory{
    public LibraryItemFactory createLibraryItem(String title,String author){
        return new Book(title,author);
    }
}
