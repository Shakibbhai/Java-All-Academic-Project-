import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class filehandling {
    private final List<Integer> list=new ArrayList<>();
    private int sumenum;
    File file=new File("D:\\New folder\\number.txt");

    public filehandling() {
        filread();
    }

    public void printnumber(){
        System.out.println("The numbers are:"+list);
    }
    public void sum(){
        int sm=0;
        for(int st:list){
            sm+=st;
        }
        System.out.println("sum is:"+sm);
        sumenum=sm;
    }
    public void average(){
            int m=list.size();
            double avg=(double)sumenum/m;
        System.out.println("average is:"+avg);
    }

    public void filread(){
        try{
            BufferedReader buff=new BufferedReader(new FileReader(file));
            String l;
            while((l=buff.readLine())!=null){
                String [] divide=l.split(" ");

                for(String a:divide){
                    int num=Integer.parseInt(a);
                    list.add(num);
                }
            }buff.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
