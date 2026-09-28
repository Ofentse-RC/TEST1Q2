public abstract class Console implements IConsoles {

    // Variables
    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Get console type
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    // Get store name
    @Override
    public String getStore() {
        return store;
    }

    // Get total sales
    @Override
    public int getTotalSales() {
        return totalSales;
    }
}