public class main {

    // Default constructor
    public main() {
        System.out.println("SURFACE AREA FOR SIDE AND CUBE");
    }

    public static void main(String[] args) {
        // Create an instance to trigger the constructor
        main calculatorMain = new main();

        // Example usage of AreaOfSide
        AreaOfSide sideCalculator = new AreaOfSide();
        double sideArea = sideCalculator.calculateSurfaceArea(5.0, 10.0);
        System.out.println("Surface area of side (5x10): " + sideArea);

        // Example usage of AreaOfCube
        AreaOfCube cubeCalculator = new AreaOfCube();
        double cubeArea = cubeCalculator.calculateSurfaceArea(7.0);
        System.out.println("Surface area of cube (side 7): " + cubeArea);
    }
}
