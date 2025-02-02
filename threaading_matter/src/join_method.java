public class join_method extends Thread {

    public void run () {
        try {
            String n = Thread.currentThread().getName();
            for (int i = 0; i < 3; i++) {
                System.out.println(n);
                Thread.sleep(1000); //3000 mili second por execute hbe eksathe
                // sleep method use korar karone obossoy interruptedException
                // handle korte hobe
            }
        }catch(InterruptedException i){
            i.printStackTrace();
        }
    }
    public static void main(String[] args) {

        join_method t1=new join_method();
        join_method t2=new join_method();
        join_method t3=new join_method();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");


        t2.start();
try {
    t2.join();
}// age jodi t2 join dao hbe na,karon age start kora lgbe
 catch (InterruptedException i){
    i.printStackTrace();
 }
        t3.start();
        t1.start();
        String n=Thread.currentThread().getName();
        for (int i = 0; i <3; i++) {
            System.out.println(n);
        }

    }
}
