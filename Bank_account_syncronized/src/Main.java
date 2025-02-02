
public class Main {
    public static void main(String[] args) {
        Account ac=new Account(5000);
        AddamountTask a=new AddamountTask(ac);
        Thread t1=new Thread(a);
        Thread t2 =new Thread(a);
        Thread t3=new Thread(a);

        t1.setName("Shakib");
        t2.setName("Rakin");
        t3.setName("Paijama");

        t1.start();t2.start();t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("total balance is now:$"+ac.getBalance());

        }
    }