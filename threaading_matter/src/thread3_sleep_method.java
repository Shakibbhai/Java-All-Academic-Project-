public class thread3_sleep_method extends Thread {


    public void run () {
        try {
            String n = Thread.currentThread().getName();
            for (int i = 0; i < 3; i++) {
                System.out.println(n);
                Thread.sleep(3000); //3000 mili second por execute hbe eksathe
                // sleep method use korar karone obossoy interruptedException
                // handle korte hobe
            }
        }catch(InterruptedException i){
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        thread3_sleep_method t1=new thread3_sleep_method();
        thread3_sleep_method t2=new thread3_sleep_method();
        thread3_sleep_method t3=new thread3_sleep_method();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        String n=Thread.currentThread().getName();
        for (int i = 0; i <3; i++) {
            System.out.println(n);
        }
    }
}
