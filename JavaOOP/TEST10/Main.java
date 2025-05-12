// main class
public class Main {

    // main method
    public static void main(String[] args) {
        Level varLow = Level.LOW;
        Level varMedium = Level.MEDIUM;
        Level varHigh = Level.HIGH;

        // object
        Second objSecond = new Second();

        // optional to change
        switch (varMedium) {
            case LOW:
                objSecond.LevelLow();
                break;
            case MEDIUM:
                objSecond.LevelMedium();
                break;
            case HIGH:
                objSecond.LevelHigh();
                break;
        }
    }
}
