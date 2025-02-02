public class Main {
    public static void main(String[] args){
        Phone_managing manage=new Phone_managing();

        manage.managePhoneBook();
        manage.startBackupThread();

    }
}
