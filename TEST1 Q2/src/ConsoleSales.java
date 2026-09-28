public class ConsoleSales extends Console {

    // Constructor
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Print report
    public void printReport() {

        System.out.println("----------------------------------------");
        System.out.println("          CONSOLE SALES REPORT");
        System.out.println("----------------------------------------");

        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name:   " + getStore());
        System.out.println("Total Sales:  " + getTotalSales());

        System.out.println("----------------------------------------");
    }
}