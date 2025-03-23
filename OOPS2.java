// construtor in java
// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

public class OOPS2 {
     
    public static void main(String[] args) {
     Student s1 = new Student("John", 20, 101);
     System.err.println(s1.name);
        System.err.println(s1.age);
        System.err.println(s1.rollno);
    }
}

class Student{
    String name;
    int age;
    int rollno;

    Student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

}
