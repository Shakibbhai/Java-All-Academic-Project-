class PrinterAdapter implements Printer {
    private ModernPrinter modernPrinter;
    private LegacyPrinter legacyPrinter;

    // Constructor for ModernPrinter
    public PrinterAdapter(ModernPrinter modernPrinter) {
        this.modernPrinter = modernPrinter;
    }

    // Constructor for LegacyPrinter
    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printDocument(String document) {
        if (modernPrinter != null) {
            // Delegate to ModernPrinter
            modernPrinter.printDocument(document);
        } else if (legacyPrinter != null) {
            // Delegate to LegacyPrinter
            legacyPrinter.printOldFormat(document);
        }
    }
}
