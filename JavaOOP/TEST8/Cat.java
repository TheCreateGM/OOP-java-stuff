// interface animal
interface Animal {
    public void makeSound();

    public void sleep();
}

// cat class
class Cat implements Animal {

    // make sound method
    public void makeSound() {
        System.out.println("Meow!");
    }

    // sleep method
    public void sleep() {
        System.out.println("Zzz...");
    }
}
