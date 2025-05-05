# Project: Volume Calculator using Java Interfaces and Inheritance

### Overview

This Java program demonstrates **object-oriented programming concepts** such as **interfaces**, **inheritance**, and **polymorphism** through a simple application that calculates the volumes of a sphere and a cylinder.

🔗 **[View](https://github.com/TheCreateGM/OOP-java-stuff/blob/main/Calculation/calculate.java)** - version 1

🔗 **[View](https://github.com/TheCreateGM/OOP-java-stuff/blob/main/SphereCylinder/program.java)** - version 2

### Files

- `calculate.java`: Contains all class definitions and the main method to run the program.

### Code Structure

#### 1. `calculation` Interface

```java
interface calculation {
    double PI = 3.142;
    abstract void findVolume();
}
```

- Declares a constant `PI`.
- Declares an abstract method `findVolume()` to be implemented by classes.

#### 2. `sphere` Class

```java
class sphere implements calculation {
    double radius;

    public sphere(double radius) {
        this.radius = radius;
    }

    public void findVolume() {
        double volume = (4.0 / 3.0) * calculation.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }
}
```

- Implements the `calculation` interface.
- Calculates the volume of a sphere using the formula: \(V = \frac{4}{3} \pi r^3\).

#### 3. `cylinder` Class

```java
class cylinder extends sphere {
    double height;

    public cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public void findVolume() {
        double volume = calculation.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}
```

- Extends the `sphere` class.
- Overrides the `findVolume()` method to compute the volume of a cylinder: \(V = \pi r^2 h\).

#### 4. `calculate` Main Class

```java
public class calculate {
    public static void main(String[] args) {
        sphere sphere = new sphere(5.0);
        cylinder cylinder = new cylinder(3.0, 7.0);

        sphere.findVolume();
        cylinder.findVolume();
    }
}
```

- Creates objects of `sphere` and `cylinder` classes.
- Calls `findVolume()` on each to display volumes.

### Sample Output

```
Volume of the sphere: 523.6666666666666
Volume of the cylinder: 197.694
```

### Concepts Demonstrated

- **Interfaces**: `calculation` defines a contract for volume calculation.
- **Inheritance**: `cylinder` extends `sphere` to reuse and extend its functionality.
- **Polymorphism**: Both `sphere` and `cylinder` use the same method name `findVolume()` but have different implementations depending on the shape.

### How to Compile and Run

```bash
javac calculate.java
java calculate
```

