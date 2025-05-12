// package
import java.util.*;

// formula class
class formulaSide {

    // attributes
    double length, width;

    // input
    void input() {
        System.out.println("\n--- Area Of Side ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
    }

    // output
    void output() {
        System.out.println("\nLength: " + length);
        System.out.println("Width: " + width);
        System.out.println("\nArea: " + length * width);
    }
}

// area of side class
public class AreaOfSide {

    // object
    formulaSide objFormula = new formulaSide();

    // call for input
    void callInput() {
        objFormula.input();
    }

    // call for output
    void callOutput() {
        objFormula.output();
    }
}
