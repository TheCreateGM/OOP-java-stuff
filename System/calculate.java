import java.util.Scanner;

// main method
public class calculate {

    int numCustomer, numItems;

    // input method
    public void inputstuff() {
        Scanner inputvalue = new Scanner(System.in);

        // input validation
        try {
            System.out.println("Enter number of customers: ");
            numCustomer = inputvalue.nextInt();
            System.out.println("Enter number of items: ");
            numItems = inputvalue.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
            inputvalue.nextLine();
            inputstuff(); // back to input method
        }
    }

    public void invoice() {
        Scanner inputvalue = new Scanner(System.in);

        // input validation
        try {
            // array
            double[][] priceitem = new double[numCustomer][numItems];
            double total = 0.0;

            // looping
            for (int i = 0; i < numCustomer; i++) {
                System.out.println("\nCustomer " + (i + 1) + ":");
                for (int j = 0; j < numItems; j++) {
                    System.out.println(
                        "Enter price for item " + (j + 1) + ": $"
                    );
                    priceitem[i][j] = inputvalue.nextDouble();
                    total += priceitem[i][j];
                }
            }

            // display total
            System.out.println("\nTotal: $" + total);

            // check discount
            if (total >= 50) {
                double discount = total * 0.1;
                double discountedTotal = total - discount;
                System.out.println("Discount applied: $" + discount);
                System.out.println("Total after discount: $" + discountedTotal);
            } else {
                System.out.println("No discount applied");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            inputvalue.nextLine();
            invoice(); // back to invoice method
        }
    }

    // main String[]
    public static void main(String[] args) {
        try {
            calculate calc = new calculate();
            calc.inputstuff();
            calc.invoice();
        } catch (Exception e) {
            System.out.println("Invalid input");
            // Create a new scanner for error handling in static context
            Scanner errorScanner = new Scanner(System.in);
            errorScanner.nextLine();
            // Create a new instance to call invoice in the catch block
            calculate calc = new calculate();
            calc.invoice();
        }
    }
}
