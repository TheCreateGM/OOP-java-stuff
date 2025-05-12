import java.util.Scanner;

public class BMICalculator {

    // Method 1: Input height and weight, calculate BMI, and store in array
    public static void inputAndCalculateBMIs(
        double[] heights,
        double[] weights,
        double[] bmis
    ) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println(
                "Enter height in meters for person " + (i + 1) + ": "
            );
            heights[i] = scanner.nextDouble();

            System.out.println(
                "Enter weight in kilograms for person " + (i + 1) + ": "
            );
            weights[i] = scanner.nextDouble();

            bmis[i] = calculateBMI(heights[i], weights[i]);
        }
    }

    // Method 2: Calculate BMI using the formula BMI = weight / (height * height)
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    // Method 3: Print BMIs with 2 decimal places
    public static void printBMIs(double[] bmis) {
        System.out.println("\nBMI Results:");
        for (int i = 0; i < bmis.length; i++) {
            System.out.printf("Person %d: %.2f%n", (i + 1), bmis[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        double[] heights = new double[5];
        double[] weights = new double[5];
        double[] bmis = new double[5];

        inputAndCalculateBMIs(heights, weights, bmis);
        printBMIs(bmis);
    }
}
