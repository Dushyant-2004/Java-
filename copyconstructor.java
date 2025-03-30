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