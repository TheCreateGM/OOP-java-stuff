public class main5 {
    int a = 5;

    public static void main(String[] args) {
        main5 obj1 = new main5();
        main5 obj2 = new main5();
        // store values for obj2
        obj2.a = 25;
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}
