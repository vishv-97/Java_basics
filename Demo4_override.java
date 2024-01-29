// Superclass
class Animal {
    // Method in the superclass
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Overriding the makeSound method in the subclass
    //@Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass inheriting from Animal
class Cat extends Animal {
    // Overriding the makeSound method in the subclass
    //@Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Demo4_override {
    public static void main(String[] args) {
        // Creating instances of the subclasses
        //Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Calling the overridden methods
        //myAnimal.makeSound();
        myDog.makeSound(); // Outputs: Dog barks
        myCat.makeSound(); // Outputs: Cat meows
    }
}

