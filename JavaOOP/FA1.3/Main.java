// package
import java.util.*;

// main class
public class Main {

    // constructor
    public Main() {
        System.out.println("SURFACE AREA FOR SIDE AND CUBE");
    }

    void displaySide() {
        System.out.println("\n--- Area Of Side ---");
    }

    void displayCube() {
        System.out.println("\n--- Area Of Cube ---");
    }

    // main method
    public static void main(String[] args) {
        // objects
        Main objMain = new Main();

        Scanner scanner = new Scanner(System.in);

        // area of side
        AreaSide objSide = new AreaSide();

        // input for side
        objMain.displaySide();
        System.out.print("Enter length: ");
        double lenSide = scanner.nextDouble();
        System.out.print("Enter width: ");
        double widSide = scanner.nextDouble();

        // output for side
        double sideArea = objSide.calAreaSide(lenSide, widSide);
        System.out.println("\nSurface area of side: " + sideArea);

        // area of cube
        AreaCube objCube = new AreaCube();

        // input for cube
        objMain.displayCube();
        System.out.print("Enter length of cube: ");
        double lenCube = scanner.nextDouble();

        // output for cube
        double cubeArea = objCube.calAreaCube(lenCube);
        System.out.println("\nSurface area of cube: " + cubeArea);
    }
}
