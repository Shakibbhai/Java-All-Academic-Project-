
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String projectPath = "C:\\Users\\HP\\IdeaProjects\\fortest\\src\\Person.java";
        List<Class<?>> classes = getClasses(projectPath);

        for (Class<?> c : classes) {
            System.out.println("Class: " + c.getName());

            // Print constructors
            System.out.println("Constructors:");
            Constructor<?>[] constructors = c.getConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            // Print fields
            System.out.println("\nFields:");
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            // Print methods
            System.out.println("\nMethods:");
            Method[] methods = c.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

            System.out.println("--------------");
        }
    }

    private static List<Class<?>> getClasses(String projectPath) {
        List<Class<?>> classes = new ArrayList<>();
        File projectDirectory = new File(projectPath);

        if (projectDirectory.exists() && projectDirectory.isDirectory()) {
            findClasses(projectDirectory, classes, "");
        }

        return classes;
    }

    private static void findClasses(File directory, List<Class<?>> classes, String packageName) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findClasses(file, classes, packageName + file.getName() + ".");
                } else if (file.getName().endsWith(".class")) {
                    try {
                        String className = packageName + file.getName().substring(0, file.getName().length() - 6);
                        classes.add(Class.forName(className));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
