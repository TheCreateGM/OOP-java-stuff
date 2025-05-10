import java.util.InputMismatchException; // Needed to catch this specific exception
import java.util.Scanner; // Needed for user input

public class ElectionEligibilityChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";
        int age = 0;
        boolean inputSuccess = false; // Flag to check if age input was successful

        System.out.println("--- Election Eligibility Checker ---");

        // Get the user's name
        System.out.print("Enter your name: ");
        name = input.nextLine(); // Read the full line for the name

        // Get the user's age and handle potential non-integer input
        try {
            System.out.print("Enter your age: ");
            age = input.nextInt(); // This is where InputMismatchException can occur
            inputSuccess = true; // Set flag to true if nextInt() was successful
        } catch (InputMismatchException e) {
            // This block executes if the user did not enter a valid integer for age
            System.err.println(
                "\nInvalid input! Please enter a whole number for your age."
            );
        } finally {
            // The finally block executes whether an exception occurred or not.
            input.close();
        }

        // Check eligibility ONLY if the age input was successful
        if (inputSuccess) {
            System.out.println("\n--- Election Status ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            // Branching statement (if-else) to check eligibility based on age
            if (age >= 18) {
                System.out.println("Status: Eligible");
            } else {
                System.out.println("Status: Not eligible");
            }
        } else {
            // Message already printed in the catch block
            System.out.println(
                "\nCould not determine eligibility due to invalid age input."
            );
        }

        System.out.println("--- Program End ---");
    }
}
