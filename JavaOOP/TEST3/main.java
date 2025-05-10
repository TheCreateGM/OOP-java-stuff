// abstract class
abstract class main {

    public String fname = "Adam";
    public int age = 20;

    public abstract void study();
}

// subclass
class Student extends main {

    public int graduationYear = 2026;

    public void study() {
        System.out.println("Study and play game.");
    }
}
