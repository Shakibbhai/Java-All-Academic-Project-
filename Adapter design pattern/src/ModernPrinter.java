class ModernPrinter implements Printer {
    @Override
    public void printDocument(String document) {
        System.out.println("Modern Printer is printing...: " + document);
    }
}
