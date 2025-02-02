class Printer {
    private static String department;

    private Printer(String department) {
        this.department = department;
    }

    public static Printer createPrinter(String department) {
        return new Printer(department);
    }

    public void print(String document) {
        System.out.println("[" + department + " Printer] Printing: " + document);
    }
}


