public class interrup_method extends Thread {

    public void run () {
        try {
            for(int i=0;i<3;i++) {
                System.out.println("thread coming bossss:,.....");
                Thread.sleep(1000);
            }
        }catch(InterruptedException i){
            System.out.println(" exception occurs>.........");
        }
    }
    public static void main(String[] args) {
        interrup_method t1=new interrup_method();
        interrup_method t2=new interrup_method();
        interrup_method t3=new interrup_method();

        t1.start();
        t1.interrupt();
        //t2.start();
        //t3.start();
    }
}
