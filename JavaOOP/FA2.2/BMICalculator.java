// package
import java.util.*;

// BMI calculator class
public class BMICalculator {

    // input calculator
    public static void inputCalcBMI(
        double[] heights,
        double[] weights,
        double[] bmis
    ) {
        Scanner scanner = new Scanner(System.in);

        // looping
        for (int i = 0; i < 5; i++) {
            System.out.println("--- Person [" + (i + 1) + "] ---");
            // height
            System.out.println("Enter height in meter [" + (i + 1) + "]: ");
            heights[i] = scanner.nextDouble();
            // weight
            System.out.println("Enter weight in kilograms [" + (i + 1) + "]: ");
            weights[i] = scanner.nextDouble();
            bmis[i] = calcBMI(heights[i], weights[i]);
        }
    }

    // calculate
    public static double calcBMI(double height, double weight) {
        return weight / (height * height);
    }

    // print/display
    public static void printBMI(double[] bmis) {
        System.out.println("\nBMI Results:");
        // looping
        for (int i = 0; i < bmis.length; i++) {
            System.out.printf("Person %d: %.2f%n", (i + 1), bmis[i]);
        }
    }

    // main method
    public static void main(String[] args) {
        // attribute
        double[] heights = new double[5];
        double[] weights = new double[5];
        double[] bmis = new double[5];

        // call input and print
        inputCalcBMI(heights, weights, bmis);
        printBMI(bmis);
    }
}
