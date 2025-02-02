public class isalive_method implements Runnable {

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
        isalive_method a=new isalive_method();

        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        Thread t3=new Thread(a);

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        //t1.start(); for again this .IllegalThreadStateException is shown
        t2.start();
        System.out.println(t2.isAlive());
        t3.start();

    }
}
