// Class with constructors
class Person {
    String name;
    int age;

    // Default Constructor
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class typeconstructor {
    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();
        p1.display();

        // Using parameterized constructor
        Person p2 = new Person("Alice", 25);
        p2.display();
    }
}
