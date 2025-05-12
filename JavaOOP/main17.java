// outer class
class OuterClass {
    // attribute
    int a = 10;

    // inner class
    static class InnerClass {
        int b = 5;
    }
}

// main class
public class main17 {
    // main method
    public static void main(String[] args) {
        // call for inner
        OuterClass.InnerClass objInner = new OuterClass.InnerClass();

        // output
        System.out.println(objInner.b);
    }
}
