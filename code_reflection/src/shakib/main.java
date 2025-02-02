package shakib;
import java.lang.reflect.*;


import static java.lang.Class.forName;

public class main {
    public static void main(String[] args) {
        try{
            Cat mycat=new Cat("puchi",6);
           // Class c= Class.forName("Cat");
            Field[] catfield=mycat.getClass().getDeclaredFields();
            Method[] methods=mycat.getClass().getDeclaredMethods();
            System.out.println("class name is:");
           // System.out.println(c);

            System.out.println("Fields are:\n");
            for (Field field:catfield){
                System.out.println(field.getName());
            }
            System.out.println("\nMethods are:\n");
            for (Method method:methods){
                System.out.println(method.getName());
            }
            System.out.println("\nspecial methods that u want print:");
            for (Method method:methods){
                if(method.getName().equals("private_stati")) {
                    method.setAccessible(true);//for private method invoke korar jnno
                    method.invoke(mycat);
                }
            }
            Constructor[] con=mycat.getClass().getDeclaredConstructors();
            System.out.println("\nConstructors are:\n");
            for(Constructor cons:con){
                System.out.println(cons);
            }
        }catch (Exception e ){ //InvocationTargetException.
            e.printStackTrace();
        }
    }
}