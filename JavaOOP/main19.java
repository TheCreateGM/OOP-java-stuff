// package
import java.util.*;

public class main19 {
    // attribute
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    // set method for a
    public void SetA(int a) {
        this.a = a;
    }

    // set method for b
    public void SetB(int b) {
        this.b = b;
    }

    // sum (+)
    public void sum() {
        System.out.println(a + b);
    }

    // sub (-)
    public void sub() {
        System.out.println(a - b);
    }

    // main method
    public static void main(String[] args) {
        main19 obj = new main19();

        // use set
        obj.SetA(obj.a);
        obj.SetB(obj.b);

        // output
        obj.sum();
        obj.sub();
    }
}
