import java.io.*;

// abstract class
abstract class LoginBase {

    final int password = 111;
    protected String username;

    LoginBase() {
        System.out.println("LOGIN FORM");
    }

    public void printUsernameInfo() {
        System.out.println("Your Username must be your name or nickname");
    }

    public abstract void login();
}

// main class
class UserLogin extends LoginBase {

    BufferedReader reader;

    UserLogin() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    // inputUsername method
    public void inputUsername() {
        System.out.print("Please enter your username: ");
        try {
            this.username = reader.readLine();
        } catch (IOException e) {
            System.err.println(
                "Error reading username input: " + e.getMessage()
            );
            this.username = "Input_Error";
        }
    }

    // override login method
    @Override
    public void login() {
        System.out.println("\n--- Login Attempt Details ---");
        System.out.println("Entered Username: " + this.username);
        System.out.println("Password (hardcoded): " + this.password);
    }

    // main method
    public static void main(String[] args) {
        UserLogin userObj = new UserLogin();
        userObj.printUsernameInfo();
        userObj.inputUsername();
        userObj.login();
    }
}
