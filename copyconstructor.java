class Student {
    String name;
    int age;

    // No-argument constructor
    Student() {
        // Initialize default values
        this.name = "";
        this.age = 0;
    }

    // Copy Constructor (takes an object of the same class as a parameter)
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class copyconstructor {
    public static void main(String[] args) {
        // Creating the first object manually
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.display();

        // Creating a new object using the copy constructor
        Student s2 = new Student(s1);
        s2.display();
    }
}

class vehicle{
    String name;
    int year;

    // No-argument constructor
    vehicle() {
        // Initialize default values
        this.name = "";
        this.year = 0;
    }

    // Copy Constructor (takes an object of the same class as a parameter)
    vehicle(vehicle v) {
        this.name = v.name;
        this.year = v.year;
    }

    // Method to display vehicle details
    void display() {
        System.out.println("Name: " + name + ", Year: " + year);
    }
}