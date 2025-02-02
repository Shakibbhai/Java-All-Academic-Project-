public class User implements personuser{
    private final int id;
    private final String fullname;
    private final String address;
    private final String username;

    public User(int id, String fullname, String address, String username) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }
    public String toString() {
        return "ID-"+id+" ,"+"FullName-"+fullname+" ,"+"address-"+address+" ,"+"username-"+username+"\n";
    }



}
