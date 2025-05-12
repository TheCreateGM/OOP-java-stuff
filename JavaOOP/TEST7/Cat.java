// abstract animal class
abstract class Animal {

    // abstract method
    abstract void makeSound();

    // regular method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

// subclass but inherit to animal
class Cat extends Animal {

    void makeSound() {
        System.out.println("Meow");
    }
}
