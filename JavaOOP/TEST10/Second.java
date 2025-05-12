// choose interface
interface Choose {
    public void LevelLow();

    public void LevelMedium();

    public void LevelHigh();
}

// second class
public class Second implements Choose {

    public void LevelLow() {
        System.out.println("Low level");
    }

    public void LevelMedium() {
        System.out.println("Medium level");
    }

    public void LevelHigh() {
        System.out.println("High level");
    }
}
