public class main12 {
    // attribute
    int modelYear;
    String modelName;

    // constructor parameters
    public main12(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    // main method
    public static void main(String[] args) {
        main12 obj = new main12(2025, "AxoGM");
        System.out.println(obj.modelYear + " " + obj.modelName);
    }
}
