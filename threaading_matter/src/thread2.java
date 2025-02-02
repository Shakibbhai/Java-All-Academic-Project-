// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class thread2 implements Runnable{
    public void run () {
        try {
            for (int i = 0; i <=5; i++) {
                System.out.println("munnaa");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        thread2 t=new thread2();
        Thread a=new Thread(t);
        a.start();
        for(int i=0;i<=5;i++){
            System.out.println("gunda");
            Thread.sleep(1000);
        }


    }

}