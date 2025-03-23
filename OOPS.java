public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);
        p1.setColor("Blue");
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;
    
    void setTip(int newTip) {
        tip = newTip;
    }

    void setColor(String newColor){
        color = newColor;
    }
}

class Student {
    String name;
    int age;
    Pen pen;
}