import java.lang.reflect.*;
import java.lang.reflect.InvocationTargetException;


public class findin_method {
    public static void main(String[] args) {
        // Specify the class you want to inspect
        //java.util.ArrayList     for all the methods of Arraylist
        String className = "shakib.Cat";

        try {
            // Load the class
            Class<?> clazz = Class.forName(className);

            // Print the class name
            System.out.println("Class Name: " + clazz.getName());

            System.out.println("Fields are:\n");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("  " + field.getName());
            }


            // Print constructors
            System.out.println("Constructors:");
            Constructor [] constructors = clazz.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("  " + constructor);
            }

            // Print methods
            System.out.println("Methods:");
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                System.out.println("  " + method);
            }
            System.out.println("invoked method...");
           // System.out.println("Invoked private static method...");
            Method privateStaticMethod = clazz.getDeclaredMethod("private_stati");
            privateStaticMethod.setAccessible(true);
            privateStaticMethod.invoke(null);

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

