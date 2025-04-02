// This program demonstrates inheritance in Java by creating a base class Animal and a derived class Dog.
// The Dog class inherits from the Animal class and adds an additional property 'breed'.    
// Base class
class Animal {
    String name;

    // Constructor for Animal
    Animal(String name) {
        this.name = name;
    }

    // Method to display animal details
    void display() {
        System.out.println("Animal Name: " + name);
    }
}

// Derived class
class Dog extends Animal {
    String breed;

    // Constructor for Dog
    Dog(String name, String breed) {
        super(name); // Call the constructor of the base class
        this.breed = breed;
    }

    // Method to display dog details
    @Override
    void display() {
        super.display(); // Call the display method of the base class
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class inheritance {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.display();
    }
}