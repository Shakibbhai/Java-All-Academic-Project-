
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleJavaParser {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SimpleJavaParser <root_directory>");
            System.exit(1);
        }

        String rootDirectory = args[0];
        List<JavaClass> javaClasses = parseJavaFiles(rootDirectory);

        for (JavaClass javaClass : javaClasses) {
            System.out.println(javaClass);
        }
    }

    private static List<JavaClass> parseJavaFiles(String rootDirectory) {
        List<JavaClass> javaClasses = new ArrayList<>();
        List<String> javaFiles = getJavaFiles(rootDirectory);

        for (String javaFile : javaFiles) {
            JavaClass javaClass = parseJavaFile(javaFile);
            javaClasses.add(javaClass);
        }

        return javaClasses;
    }

    private static List<String> getJavaFiles(String rootDirectory) {
        List<String> javaFiles = new ArrayList<>();
        File root = new File(rootDirectory);

        if (root.isDirectory()) {
            File[] files = root.listFiles((dir, name) -> name.endsWith(".java"));
            if (files != null) {
                for (File file : files) {
                    javaFiles.add(file.getAbsolutePath());
                }
            }
        }

        return javaFiles;
    }

    private static JavaClass parseJavaFile(String javaFile) {
        JavaClass javaClass = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(javaFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("class ")) {
                    String className = line.split("class ")[1].split("\\s+")[0];
                    javaClass = new JavaClass(className);
                } else if (line.contains("(") && line.contains(")")) {
                    // Check for method declaration
                    Pattern methodPattern = Pattern.compile("([a-zA-Z_$][a-zA-Z\\d_$]*)\\s+([a-zA-Z_$][a-zA-Z\\d_$]*)\\([^)]*\\)\\s*\\{");
                    Matcher methodMatcher = methodPattern.matcher(line);
                    if (methodMatcher.find()) {
                        String methodName = methodMatcher.group(2);
                        String methodSignature = methodMatcher.group(1);
                        JavaMethod method = new JavaMethod(methodName, methodSignature);
                        javaClass.addMethod(method);
                    }

                    // Check for invoked methods
                    Pattern invokePattern = Pattern.compile("([a-zA-Z_$][a-zA-Z\\d_$]*)\\([^)]*\\);");
                    Matcher invokeMatcher = invokePattern.matcher(line);
                    while (invokeMatcher.find()) {
                        javaClass.addInvokedMethod(invokeMatcher.group(1));
                    }
                } else if (line.contains(";")) {
                    // Check for field declaration
                    Pattern fieldPattern = Pattern.compile("([a-zA-Z_$][a-zA-Z\\d_$]*)\\s+([a-zA-Z_$][a-zA-Z\\d_$]*)\\s*;");
                    Matcher fieldMatcher = fieldPattern.matcher(line);
                    if (fieldMatcher.find()) {
                        String fieldName = fieldMatcher.group(2);
                        String fieldType = fieldMatcher.group(1);
                        JavaField field = new JavaField(fieldName, fieldType);
                        javaClass.addField(field);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return javaClass;
    }
}