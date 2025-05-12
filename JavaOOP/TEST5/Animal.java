class Animal {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

// inherite to Animal class
class Cat extends Animal {

    public void animalSound() {
        System.out.println("The cat meows");
    }
}

class Dog extends Animal {

    public void animalSound() {
        System.out.println("The dog barks");
    }
}
