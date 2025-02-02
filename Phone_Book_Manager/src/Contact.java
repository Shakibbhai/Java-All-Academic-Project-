public class Contact {
    private String FirstName;
    private String LastName;
    private String Email_id;


    public Contact(String firstName, String lastName, String email_id) {
        FirstName = firstName;
        LastName = lastName;
        Email_id = email_id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail_id() {
        return Email_id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail_id(String email_id) {
        Email_id = email_id;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email_id='" + Email_id + '\'' +
                '}';
    }
}
