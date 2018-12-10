import java.util.*;
import java.lang.*;
class ArmstrongNumber                      //class creation
{ 
    static void display(int number)        //function creation
    {
       int count=0;
       int i;  
       int temp=number;
       int a=0;
       while(temp!=0)              
       {
         
          temp = temp / 10;
          count = count + 1;
       }
         temp = number;
       while(temp>0)
        {
           i = temp%10;
           temp = temp / 10;
           a = a + (int) Math.pow(i , count );
        }
     if(a==number)                                      //comparing with original number with the expected number
     { 
       System.out.println("Armstrong Number ");
     }
      else
      {
        System.out.println("Not Armstrong Number ");   
      }
  }           
   public static void main(String[] args)
   {
       
       System.out.println("enter Number : ");
       Scanner sc = new Scanner(System.in);     
       int number  = sc.nextInt();                    //storing number value
       display(number);                  // function calls
    }
}
       