// main class
public class Main {

    // contrustor
    public Main() {
        System.out.println("--- Data Information ---\n");
    }

    // main method
    public static void main(String[] args) {
        // object
        Main objMain = new Main();
        Display objDisplay = new Display();
        objDisplay.UserInput();
        objDisplay.UserOutput();
    }
}
