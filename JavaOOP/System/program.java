import java.util.Scanner;

// main class
public class program {

    int noOfCust, noOfItems;

    // input data
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        noOfCust = scanner.nextInt();
        System.out.print("Enter number of items: ");
        noOfItems = scanner.nextInt();
    }

    // process data
    public void process() {
        Scanner scanner = new Scanner(System.in);
        double[][] ItemPrice = new double[noOfItems][noOfCust];
        double TotalPrice = 0.0;

        // looping System
        System.out.println("Enter price of each item:");
        for (int i = 0; i < noOfCust; i++) {
            System.out.println("Customer " + (i + 1) + ":");
            for (int j = 0; j < noOfItems; j++) {
                System.out.print("Item " + (j + 1) + ": $");
                ItemPrice[j][i] = scanner.nextDouble();
                TotalPrice += ItemPrice[j][i];
            }
        }

        // output data
        System.out.println("Total price: $" + TotalPrice);

        // apply discount
        if (TotalPrice >= 50) {
            double discount = TotalPrice * 0.1;
            TotalPrice -= discount;
            System.out.println("Discount applied: $" + discount);
            System.out.println("Final price: $" + TotalPrice);
        } else {
            System.out.println("No discount applied.");
            System.out.println("Final price: $" + TotalPrice);
        }
    }

    // main method
    public static void main(String[] args) {
        program program = new program();

        // error handling
        try {
            program.inputData();
            program.process();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
