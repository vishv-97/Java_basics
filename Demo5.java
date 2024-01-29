// Base class
class Animal {
    // Method to make a sound
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Subclass 1
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Demo5 {
    // Method to demonstrate polymorphism
    static void letAnimalMakeSound(Animal animal) {
        // This method works with any object of type Animal or its subclasses
        animal.makeSound();
    }

    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Using the method that accepts an Animal
        letAnimalMakeSound(myDog); // Outputs: Dog barks
        letAnimalMakeSound(myCat); // Outputs: Cat meows
    }
}

