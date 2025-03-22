

import java.util.Scanner;
public class functions {

    public static void Helloworld(){ // function making
        System.out.println("Hello World");  
    }

    public static void calculateSum(){
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("The sum is "+sum);
            sc.close();
    }
    public static void main(String args[]){
       Helloworld(); // calling the function
       calculateSum();}
}
