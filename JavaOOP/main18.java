// package
import java.util.*;

// input object interface
interface inputObj {
    public void inputUser();
}

// call for action class
class CallForAction implements inputObj {
    public void inputUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        System.out.println("Username is: " + userName);
    }
}

// main class
public class main18 {
    // constructor
    public main18() {
        System.out.println("---Data Information---\n");
    }

    // main method
    public static void main(String[] args) {
        // object
        main18 obj = new main18();
        CallForAction objCFA = new CallForAction();

        // call for input object
        objCFA.inputUser();
    }
}
