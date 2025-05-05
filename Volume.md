# Volume Calculation Program in Java

This Java program calculates and prints the volume of a **sphere** and a **cylinder** using **object-oriented programming principles** such as **interfaces**, **inheritance**, and **method overriding**.

## 📌 Objectives

* Demonstrate use of **Java interfaces** with constants and abstract methods.
* Implement and override the `findVolume()` method to calculate volumes of different 3D shapes.
* Showcase **inheritance** by extending a class and using `super` to reuse method functionality.

---

## 🧩 Program Structure

The program consists of the following components:

### 1. `InputProgram` Interface

```java
interface InputProgram {
    double PI = 3.142;
    void findVolume();
}
```

* Declares a constant `PI` with the value 3.142.
* Declares an abstract method `findVolume()` that must be implemented by any class that implements this interface.

---

### 2. `SphereObject` Class

```java
class SphereObject implements InputProgram {
    double radius = 5;

    public void findVolume() {
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }
}
```

* Implements `InputProgram`.
* Declares a `radius` variable initialized to `5`.
* Implements the `findVolume()` method to calculate and print the volume of a sphere using the formula:

  $$
  \text{Volume}_{\text{sphere}} = \frac{4}{3} \cdot \pi \cdot r^3
  $$

---

### 3. `CylinderObject` Class

```java
class CylinderObject extends SphereObject {
    double height = 10;

    public void findVolume() {
        super.findVolume();
        double volume = PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}
```

* Inherits from `SphereObject`.
* Adds a new variable `height`, initialized to `10`.
* Overrides `findVolume()`:

  * First, it calls `super.findVolume()` to reuse the sphere volume calculation.
  * Then it calculates the cylinder volume using:

    $$
    \text{Volume}_{\text{cylinder}} = \pi \cdot r^2 \cdot h
    $$

---

### 4. `program` Class (Main Method)

```java
public class program {
    public static void main(String[] args) {
        CylinderObject cylinder = new CylinderObject();
        cylinder.findVolume();
    }
}
```

* Contains the `main()` method.
* Creates an object of `CylinderObject` and calls its `findVolume()` method.
* Outputs:

  1. Volume of the sphere
  2. Volume of the cylinder

---

## 🧪 Sample Output

```
Volume of the sphere: 523.6666666666666
Volume of the cylinder: 785.5
```

---

## 🛠️ How to Run

1. Save the program as `program.java`.

2. Compile the program:

   ```bash
   javac program.java
   ```

3. Run the program:

   ```bash
   java program
   ```

---

## ✅ Key Concepts Used

* Java **interface** and **constant field**
* **Inheritance** and use of `super`
* **Method overriding**
* Basic **math operations** with `Math.pow()`

---

## 💡 Notes

* This program uses hardcoded values for radius and height, but it can be easily modified to take user input using `Scanner`.
* The program follows the principle of **code reuse** by calling the superclass method from the subclass.

