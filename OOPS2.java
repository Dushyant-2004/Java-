// construtor in java
// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

public class OOPS2 {
     
    public static void main(String[] args) {
        books b1 = new books("Java", 500, 1000);
        System.err.println(b1.name);
        System.err.println(b1.price);
        System.err.println(b1.pages);
        
        Student s1 = new Student("John", 20, 101);
        System.err.println(s1.name);
        System.err.println(s1.age);
        System.err.println(s1.rollno);
        System.err.println("Hello");
        
        books b2 = new books("Python", 600, 2000);
        System.err.println(b2.name);        
        System.err.println(b2.price);
        System.err.println(b2.pages);
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

class books{
    String name;
    int price;
    int pages;

    books(String name, int price, int pages){
        this.name = name;
        this.price = price;
        this.pages = pages;
    }
}

class books2{
    String name;
    int price;
    int pages;

    books2(String name, int price, int pages){
        this.name = name;
        this.price = price;
        this.pages = pages;
    }
}