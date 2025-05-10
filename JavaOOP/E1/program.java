interface Innerprogram {
    double PI = 3.142;
    void findVolume();
}

class Sphere implements Innerprogram {

    double radius = 5;

    @Override
    public void findVolume() {
        double volume = (4.0 / 3.0) * PI * radius * radius * radius;
        System.out.println("Volume of sphere: " + volume);
    }
}

class Cylinder extends Sphere {

    double height = 10;

    @Override
    public void findVolume() {
        super.findVolume();
        double volume = PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}

public class program {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.findVolume();
    }
}
