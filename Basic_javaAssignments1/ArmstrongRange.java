import java.util.*;
class ArmstrongRange
{
public static void main(String args[])
{
   
       int count = 0;
       
       int a=0;
       for(int i=100;i<=999;i++)
       {
          int number=i;
          while(number!=0)              
          {
         
          number = number / 10;
          count = count + 1;
          }
       
       while(number>0)
         {
           int b  = number%10;
	  a = a + (int) Math.pow(b , count);
           number = number/ 10;
         }
          if(a==i)
         {
           System.out.println(i+" ");
 
         }
         a=0;
      }
}
    
   

}
