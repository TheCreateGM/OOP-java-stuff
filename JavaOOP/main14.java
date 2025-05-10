// static
public class main14 {
    // static method
    static void staticMethod() {
        System.out.println("Static method was call");
    }

    // public method
    public void publicMethod() {
        System.out.println("Public method was call");
    }

    // main method
    public static void main(String[] args) {
        // call for static method
        staticMethod();

        // call for public method
        main14 obj = new main14();
        obj.publicMethod();
    }
}
