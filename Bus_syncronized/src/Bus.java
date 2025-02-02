//import java.time.Clock;

public class Bus implements Runnable {
    private int available=2;
    private final int passenger;

    public Bus(int passenger) {
        this.passenger = passenger;
    }

    public synchronized void run(){
        String name=Thread.currentThread().getName();
        if(available>=passenger){
            System.out.println(name+" seat reserved.");
            available-=passenger;
        }else {
            System.out.println("Sorry Mr."+name+" seat not available.");
        }
    }
}
