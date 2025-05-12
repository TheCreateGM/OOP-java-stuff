// package
import java.util.*;

// fomula class
class formulaCube {

    // attribute
    double length;

    // input
    void input() {
        System.out.println("\n--- Area Of Cube ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the cube: ");
        length = scanner.nextInt();
    }

    // output
    void output() {
        System.out.println("\nThe area of the cube is: " + (6 * length));
    }
}

// area of cube class
public class AreaOfCube {

    // object
    formulaCube objFormula = new formulaCube();

    // call for input
    void callInput() {
        objFormula.input();
    }

    // call for output
    void callOutput() {
        objFormula.output();
    }
}
