import java.io.*;
import java.util.*;

public class filehandl {
    private  List<Person> list=new ArrayList<>();
    File file=new File("D:\\New folder\\person.txt");


    public void add(String name, int age, double salary){
        Person c=new Person(name,age,salary);
        list.add(c);
        savotofile();

    }
    public void delete(String name, int age, double salary) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person t = iterator.next();
            if (t.getName().equals(name) && t.getAge() == age && Double.compare(t.getSalary(), salary) == 0) {
                iterator.remove();
            }
        }
        savotofile();
    }
    public void savotofile() {
        try {
            BufferedWriter b = new BufferedWriter(new FileWriter(file));
            for(Person g:list) {
                b.write(g.getName()+","+g.getAge()+","+g.getSalary()+"\n");
                System.out.println(g);
            }
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readfile(){
        try{
            BufferedReader a=new BufferedReader(new FileReader(file));
            String l;
            while((l=a.readLine())!=null){
                String []divide=l.split(",");
                String Name=divide[0];
                int age=Integer.parseInt(divide[1]);
                double salary=Double.parseDouble(divide[2]);

                Person pers=new Person(Name,age,salary);
                list.add(pers);

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
