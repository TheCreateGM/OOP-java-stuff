public class main {

    // main method
    public static void main(String[] args) {
        // object
        OuterClass objOuter = new OuterClass();
        OuterClass.InnerClass objInner = objOuter.new InnerClass();
        System.out.println(objInner.InnerMethod());
    }
}
