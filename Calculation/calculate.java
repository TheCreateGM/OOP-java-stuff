// interface
interface calculation {
    // PI = 3.142
    double PI = 3.142;

    // abstract method
    abstract void findVolume();
}

// override
// sphere
class sphere implements calculation {

    // radius
    double radius;

    // constructor
    public sphere(double radius) {
        this.radius = radius;
    }

    // method to calculate volume
    public void findVolume() {
        double volume = (4.0 / 3.0) * calculation.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }
}

// cylinder
class cylinder extends sphere {

    // height
    double height;

    // constructor
    public cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // method to calculate volume
    public void findVolume() {
        double volume = calculation.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}

// main class
public class calculate {

    public static void main(String[] args) {
        // create objects
        sphere sphere = new sphere(5.0);
        cylinder cylinder = new cylinder(3.0, 7.0);

        // calculate volume
        sphere.findVolume();
        cylinder.findVolume();
    }
}
