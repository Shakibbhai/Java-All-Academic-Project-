public class suspend_resume1 extends Thread {

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

        suspend_resume1 t1=new suspend_resume1();
        suspend_resume1 t2=new suspend_resume1();
        suspend_resume1 t3=new suspend_resume1();

        t1.setName("Rahul");
        t2.setName("kaku");
        t3.setName("Saku");

        t1.start();
        t2.start();
        t3.start();
       // t2.suspend();//
        // t2.resume();// e dui ta jdk thke bad dewa hoise ,

        String n=Thread.currentThread().getName();
        for (int i = 0; i <3; i++) {
            System.out.println(n);
        }

    }
}

