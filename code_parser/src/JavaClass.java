import java.util.ArrayList;
import java.util.List;

class JavaClass {
    private String className;
    private List<JavaMethod> methods;
    private List<String> invokedMethods;
    private List<JavaField> fields;

    public JavaClass(String className) {
        this.className = className;
        this.methods = new ArrayList<>();
        this.invokedMethods = new ArrayList<>();
        this.fields = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public List<JavaMethod> getMethods() {
        return methods;
    }

    public List<String> getInvokedMethods() {
        return invokedMethods;
    }

    public List<JavaField> getFields() {
        return fields;
    }

    public void addMethod(JavaMethod method) {
        methods.add(method);
    }

    public void addInvokedMethod(String methodName) {
        invokedMethods.add(methodName);
    }

    public void addField(JavaField field) {
        fields.add(field);
    }

    @Override
    public String toString() {
        return "Class: " + className +
                "\nDeclared Methods: " + methods +
                "\nInvoked Methods: " + invokedMethods +
                "\nDeclared Fields: " + fields + "\n";
    }
}