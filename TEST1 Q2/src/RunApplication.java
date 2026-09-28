import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("       ELECTRONICS STORE");
        System.out.println("       CONSOLE SALES SYSTEM");
        System.out.println("----------------------------------------");

        // Display console options
        System.out.println("Select a console device type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. NINTENDO SWITCH");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();
        input.nextLine();

        String consoleType;

        // Select console type
        switch (choice) {

            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "NINTENDO SWITCH";
                break;

            default:
                System.out.println("Invalid console choice.");
                input.close();
                return;
        }

        // Enter store name
        System.out.print("Enter store name: ");
        String storeName = input.nextLine();

        // Enter total sales
        System.out.print("Enter total amount of sales: ");
        int totalSales = input.nextInt();

        // Create ConsoleSales object
        ConsoleSales sales = new ConsoleSales(
                consoleType,
                storeName,
                totalSales
        );

        // Print report
        sales.printReport();

        input.close();
    }
}