class RunExc {

    static int num1 = 100;
    static int num2 = 0;

    static int result() {
        return num1 / num2;
    }

    public static void main(String args[]) {
        System.out.println("Attempting division...");
        try {
            // The code that might throw an exception goes here
            System.out.println(num1 + " / " + num2 + " = " + result());
        } catch (ArithmeticException e) {
            // This block executes if an ArithmeticException occurs in the try block
            System.err.println("An error occurred: Cannot divide by zero.");
        }
        // Execution continues here after the exception is handled
        System.out.println("Program finished.");
    }
}
