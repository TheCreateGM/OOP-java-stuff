public class main9 {

    // public method for fullThrottle
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // public method for speed
    public void speed(int maxSpeed) {
        System.out.println("Max speed is " + maxSpeed);
    }

    // main method
    public static void main(String[] args) {
        main9 objCar = new main9();
        objCar.fullThrottle();;
        objCar.speed(200);
    }
}
