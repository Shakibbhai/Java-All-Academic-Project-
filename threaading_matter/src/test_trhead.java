
public class test_trhead extends Thread  {

//public void fn() call korle thread hoto na
        @Override
        public void run () {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("munnaa");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) throws InterruptedException {
       test_trhead a=new test_trhead();
       a.start();//a.fn() call korte hoto
       for(int i=0;i<=5;i++){
       System.out.println("gunda");
           Thread.sleep(1000);
    }}
}
