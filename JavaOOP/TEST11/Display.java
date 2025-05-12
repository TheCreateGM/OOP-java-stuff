// package
import java.util.*;

// input display interface
interface InputDisplay {
    public void UserInput();

    public void UserOutput();
}

// display class
public class Display implements InputDisplay {

    // attribute
    String name;
    int age;
    double salary;

    // user input method
    public void UserInput() {
        Scanner scanner = new Scanner(System.in);
        // name input
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        // age input
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        // salary input
        System.out.println("Enter salary: ");
        salary = scanner.nextDouble();
    }

    // user output method
    public void UserOutput() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}
