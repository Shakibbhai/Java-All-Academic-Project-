public class Magazine implements LibraryItem {
    private String title;
    private String issue;

    public Magazine(String title, String issue) {
        this.title = title;
        this.issue = issue;  // No need to parse the issue
    }

    @Override
    public String getDetails() {
        return "Magazine: " + title + ", Issue: " + issue;
    }

    @Override
    public void borrowItem() {
        System.out.println("You borrowed the magazine: " + title);
    }
}
