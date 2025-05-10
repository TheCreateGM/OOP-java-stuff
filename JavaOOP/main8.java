public class main8 {
    // static method
    static void staticMethod() {
        System.out.println("Static method was call.");
    }

    // public method
    public void publicMethod() {
        System.out.println("Public method was call.");
    }

    // main method
    public static void main(String[] args) {
        staticMethod();

        // call public method
        main8 obj = new main8();
        obj.publicMethod();
    }
}
