import java.util.Scanner;

public class program {

    private int numberOfCustomers;
    private int numberOfItems;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        numberOfCustomers = scanner.nextInt();
        System.out.print("Enter number of items: ");
        numberOfItems = scanner.nextInt();
    }

    public void processInvoice() {
        Scanner scanner = new Scanner(System.in);
        double[][] priceItem = new double[numberOfCustomers][numberOfItems];
        double totalp = 0.0;

        System.out.println("\nEnter price of items for each customer:");

        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.println("Customer " + (i + 1) + ":");
            for (int j = 0; j < numberOfItems; j++) {
                System.out.print("Item " + (j + 1) + ": $");
                priceItem[i][j] = scanner.nextDouble();
                totalp += priceItem[i][j];
            }
        }

        System.out.println("\nTotal price: $" + totalp);

        if (totalp >= 50) {
            double discount = totalp * 0.1;
            double newTotalPrice = totalp - discount;
            System.out.println("10% Discount applied: -$" + discount);
            System.out.println("Final price after discount: $" + newTotalPrice);
        } else {
            System.out.println("NO DISCOUNT");
        }
    }

    public static void main(String[] args) {
        program invoice = new program();

        try {
            invoice.inputData();
            invoice.processInvoice();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
