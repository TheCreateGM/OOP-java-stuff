// first interface
interface FirstInterface {
    public void FirstMethod();
}

// second interface
interface SecondInterface {
    public void SecondMethod();
}

// demo class
public class DemoClass implements FirstInterface, SecondInterface {

    // first method
    public void FirstMethod() {
        System.out.println("this is first method.");
    }

    // second method
    public void SecondMethod() {
        System.out.println("this is second method.");
    }
}
