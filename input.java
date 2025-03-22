// input in java from user 


import java.util.Scanner;
public class input {
   public static void main (String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first number");
         int a = sc.nextInt();
         System.out.println("Enter the second number");
         int b = sc.nextInt();
         int c = a+b;
         System.out.println(c);
         System.out.println(a);
         System.out.println("a");
      sc.close();
   }

}
