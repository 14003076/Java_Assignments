import java.util.*;
public class LinearSearch
{
   public static void main(String[] args)
   {
        int count;
		int arrayOfElements[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
     	Scanner scanner = new Scanner(System.in);
		System.out.println("enter element to be searched : ");
		int value = scanner.nextInt();
	for(count=0;count<=arrayOfElements.length-1;count++)
	{
	     	
	     if(arrayOfElements[count]==value)                         //checking and comparing with the given value
	     {
			System.out.println("value is found at index :"+count);
		 }
		 
	}

   }
} 