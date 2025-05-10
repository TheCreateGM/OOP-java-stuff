class Arr {

    static int[] array = new int[5];
    static int sum = 0;

    static int[] myArr(int a[]) {
        array = a;
        sum = 0; // Reset sum for this calculation

        System.out.println("Processing array...");
        try {
            // Wrap the loops that might cause an ArrayIndexOutOfBoundsException
            System.out.println("Listing array elements:");
            for (int b = 0; b <= array.length; b++) {
                System.out.println("Element at index " + b + ": " + array[b]);
            }

            // This loop might not be reached if the first loop throws an exception
            System.out.println("Calculating sum:");
            for (int i = 0; i <= array.length; i++) {
                sum = sum + array[i]; // This line might fail
            }

            // This line is only reached if NO exception occurred in the try block
            System.out.println("Sum List Number: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            // This block executes if an ArrayIndexOutOfBoundsException occurs
            System.err.println(
                "\nAn error occurred: Attempted to access array out of bounds."
            );
            System.err.println(
                "Hint: Array indices are from 0 to " + (array.length - 1)
            );
        }
        // Execution continues here after the exception is handled
        System.out.println("Method myArr finished.");

        return a;
    }

    public static void main(String[] args) {
        int list[] = { 3, 6, 9, 12, 15 };
        System.out.println("Calling myArr...");
        myArr(list);
        System.out.println("Main method finished.");
    }
}
