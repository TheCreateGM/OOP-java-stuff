class Vehicle {

    // attributes
    protected String brand = "AxoGM";

    // method
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {

    // atteributes
    String modelName = "TheCreateGM";

    // main method
    public static void main(String[] args) {
        // object
        Car objCar = new Car();

        // call method
        objCar.honk();

        // output
        System.out.println(objCar.brand + " " + objCar.modelName);
    }
}
