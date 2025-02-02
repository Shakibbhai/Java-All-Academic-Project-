public class User {
    private String name;
    private boolean isPremium;

    public User(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    // Check if the user is a premium member
    public boolean isPremium() {
        return isPremium;
    }
}
