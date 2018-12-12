import java.util.*;
import java.util.Scanner;
class Duplicates

{

	public static void main(String[] args)

	{

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number of elements:");

		int numberOfElements=sc.nextInt();

		int arrayOfElements[]=new int[numberOfElements];

		System.out.println("Enter the elements");

		for(int count=0;count<arrayOfElements.length;count++)

		{

			arrayOfElements[count]=sc.nextInt();

		}

		for(int count=0;count<arrayOfElements.length;count++)                                //sorting

		{

				int temporaryVariable;

			for(int count1=count+1;count1<arrayOfElements.length;count1++)

			{

				if(arrayOfElements[count]>arrayOfElements[count1])

				{

					temporaryVariable=arrayOfElements[count];                     //sorting 

					arrayOfElements[count]=arrayOfElements[count1];

					arrayOfElements[count1]=temporaryVariable;

				}

			}

		}

			int temporaryVariable=0;

		for(int count=0;count<arrayOfElements.length-1;count++)

		{

			if(arrayOfElements[count]!=arrayOfElements[count+1])                   //checking the element 

			{

				arrayOfElements[temporaryVariable]=arrayOfElements[count];	

				temporaryVariable++;

			}

		}

			arrayOfElements[temporaryVariable]=arrayOfElements[arrayOfElements.length-1];              //removing duplicates

			int newArray[]=new int[temporaryVariable+1];                              

			System.out.println("After removing dupalicate elements");

		for(int count=0;count<newArray.length;count++)

		{

			System.out.println(arrayOfElements[count]);

		}

	}
}