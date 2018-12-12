import java.util.*;
public class SequentialSort
{
   public static void main(String[] args)
   {
 	 	int temporary ;
		int arrayOfElements[] = {5 ,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
     	Scanner scanner = new Scanner(System.in);
		
	for(int count=0;count<=arrayOfElements.length-1;count++)
	{
		
		for(int count1=count+1;count1<15;count1++)

			{

				if(arrayOfElements[count]>arrayOfElements[count1])                     //sorting logic

				{

				temporary=arrayOfElements[count];

				arrayOfElements[count]=arrayOfElements[count1];

				arrayOfElements[count1]=temporary;

				}

			}

		}

		for(int count=0;count<15;count++)                              //displaying the sorted elements

		{

		System.out.print(arrayOfElements[count]+" ");

		}

	}

}