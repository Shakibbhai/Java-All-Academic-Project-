public class Customer {
    public static void main(String[] args) {
        Bus a=new Bus(1);
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        Thread t3=new Thread(a);
        Thread t4=new Thread(a);

        t1.setName("Sakib");
        t2.setName("Rakib");
        t3.setName("Imtiaz");
        t4.setName("rakin");

      /*  t1.setPriority(3);
        t2.setPriority(7);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(5);
        */

        t1.start();
        t2.start();
        //t2.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        t4.start();

    }
}
