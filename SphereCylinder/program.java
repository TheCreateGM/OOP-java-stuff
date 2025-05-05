// This is a Java interface for an input program
interface InputProgram {
    double PI = 3.142;
    void findVolume();
}

// This is a Java class for a sphere object
class SphereObject implements InputProgram {

    double radius = 5;

    public void findVolume() {
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }
}

// This is a Java class for a cylinder object
class CylinderObject extends SphereObject {

    double height = 10;

    public void findVolume() {
        super.findVolume();
        double volume = PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}

public class program {

    public static void main(String[] args) {
        CylinderObject cylinder = new CylinderObject();
        cylinder.findVolume();
    }
}
