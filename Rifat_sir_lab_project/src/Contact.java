public class Contact {
    private String FirstName;
    private String LastName;
    private String Email_id;
    private String PhoneNumber;

    public Contact(String firstName, String lastName, String email_id, String phoneNumber) {
        FirstName = firstName;
        LastName = lastName;
        Email_id = email_id;
        PhoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return PhoneNumber;
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

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email_id='" + Email_id + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
