// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    ModernPrinter modernP=new ModernPrinter();
    Printer printAdapt1=new PrinterAdapter(modernP);
        printAdapt1.printDocument("Modern Printer Document");

        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer printerAdapter2 = new PrinterAdapter(legacyPrinter);
        printerAdapter2.printDocument("Legacy Printer Document");
        }
    }
