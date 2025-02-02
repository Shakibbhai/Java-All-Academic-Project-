import java.util.Map;
import java.util.HashMap;
class PrinterRegistry {
    private Map<String, Printer> registry = new HashMap<>();

    public Printer getPrinter(String department) {
        if (!registry.containsKey(department)) {
            registry.put(department, Printer.createPrinter(department));
        }
        return registry.get(department);
    }
}