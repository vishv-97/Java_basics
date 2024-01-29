public class Car {
    // Attributes or fields of the class
    String make;
    String model;
    int year;
    boolean isRunning;

    // Constructor to initialize the car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false; // By default, the car is not running when created
    }

    // Method to start the car
    public void start() {
        if (!isRunning) {
            System.out.println("Starting the " + year + " " + make + " " + model);
            isRunning = true;
        } else {
            System.out.println("The car is already running.");
        }
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Is Running: " + (isRunning ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022);

        // Displaying information about the car
        myCar.displayInfo();

        // Starting the car
        myCar.start();

        // Displaying information after starting the car
        myCar.displayInfo();
    }
}

