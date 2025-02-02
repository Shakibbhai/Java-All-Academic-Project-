public class Main {
    public static void main(String[] args) {
        PrinterRegistry printerRegistry = new PrinterRegistry();

        Printer IsrtPrinter = printerRegistry.getPrinter("ISRT");
        Printer iitPrinter = printerRegistry.getPrinter("IIT");

        IsrtPrinter.print("Isrt Document");
        iitPrinter.print("IIT Document");

        // same printer abar use krlm instances
        Printer iitPrinterAgain = printerRegistry.getPrinter("IIT");
        iitPrinterAgain.print("Another IIt Document");

        System.out.println("Is iitPrinter the same as iitPrinteragain? " + iitPrinterAgain.hashCode());
        System.out.println("Is iitPrinter the same as ISRTPrinter? " + iitPrinter.hashCode());




        // notun department
        Printer financePrinter = printerRegistry.getPrinter("IBA");
        financePrinter.print("IBA Report");
    }
}