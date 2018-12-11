import java.util.*;
class ArmstrongRange
{
   public static void main(String[] args)           //main function
   {  
       int i;
       int count = 0;
       int sum=0;
       for( i=100;i<1000;i++)                       //iterate the loop from 100 to 999
       {     
        int number = i;
       while(number>0)
         {
           int remainder  = number%10;
           number = number/ 10;
           sum= sum + (remainder*remainder*remainder);     
         }
          if(sum==i)
          {
           System.out.print(i+" ");                  //displaying the range from 100 to 999 armstrong numbers
 
          }
         sum = 0;
      }
  }
}
