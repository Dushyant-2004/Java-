// Defining a class
class Car {
    // Properties (state)
    String brand;
    int speed;

    // Behavior (method)
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class main {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car(); 

        // Assigning values to the object properties
        myCar.brand = "Tesla";
        myCar.speed = 200;

        // Calling method
        myCar.showDetails();
    }
}
// In this example, we define a class `Car` with properties `brand` and `speed`, and a method `showDetails()` to display the car's details. In the `main` method, we create an object of the `Car` class, assign values to its properties, and call the method to display the details.
// This demonstrates the basic principles of OOP: encapsulation (grouping data and methods), abstraction (hiding complexity), inheritance (creating new classes based on existing ones), and polymorphism (using a single interface to represent different underlying forms).