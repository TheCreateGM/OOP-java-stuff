class OuterClass {
    // attribute
    int a = 10;

    // inner class
    class InnerClass {
        // attribute
        int b = 5;
    }
}

// main class
public class main16 {
    public static void main(String[] args) {
        // object
        OuterClass objOuter = new OuterClass();
        OuterClass.InnerClass objinner = objOuter.new InnerClass();

        // output
        System.out.println(objOuter.a + objinner.b);
    }
}
