// Parent class
class Animal {
    String name;

    // Constructor with a parameter
    public Animal(String name) {
        this.name = name;
    }

    // Method to display information about the animal
    public void displayInfo() {
        System.out.println("Animal: " + name);
    }
}

// Child class extending the parent class
class Dog extends Animal {
    String breed;

    // Constructor with parameters using 'super' keyword
    public Dog(String name, String breed) {
        super(name); // Calling the constructor of the parent class
        this.breed = breed;
    }

    // Overriding the displayInfo method of the parent class (though overriding is not necessary to do)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the method of the parent class
        System.out.println("Breed: " + breed);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        // Creating an instance of the child class
        Dog myDog = new Dog("Buddy", "Labrador");

        // Calling the overridden method in the child class
        myDog.displayInfo();
    }
}
