
import java.util.*;

class Hello
{
    static double addition(double number1 , double number2)
   {
      double addition = number1+number2;
      return addition;
   }
    static double subtraction(double number1 , double number2)
   {
      double subtraction = number2-number1;
      return subtraction;
   }      
    static double multiplication(double number1, double number2)
   {
      double multiplication = number1*number2;
      return multiplication;
   } 
    static double division(double number1 , double number2)
   {
      double division = number1/number2;
      return division;
   } 
         
    static void display()
       {
          System.out.println("mycalculator"); 
       }   
  public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter number1:");
         double number1 = sc.nextDouble();
          System.out.println("enter number2");
          double number2 = sc.nextDouble();
          display();
          System.out.println("Hello World!");
          System.out.println("addition of two numbers is :"+addition( number1 , number2));
          System.out.println("subtraction of two numbers is :"+subtraction(number1 , number2));
          System.out.println("multiplication of two numbers is :"+multiplication(number1,number2));
          System.out.println("division of two numbers is :"+division(number1,number2));
     }
}
     