import java.util.*;

 public class IncomeTax 
 
 {

   public static void main(String[] args)

   {

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter your Amount");

	int amount=scan.nextInt();

	if(amount>0 && amount<180000)

	{

		System.out.println(" NULL");

	}

	  if(amount>180000 && amount<=300000)

	  {

		int total=(amount*10)/100;

		System.out.println("tax amount is:"+total);

	  }

	 else if(amount>300000 && amount<=500000)

	 {

		int total=(amount*20)/100;

		System.out.println("tax amount is:"+total);

	 }

	else if(amount>500000 && amount<=1000000)

	{

		int total=(amount*30)/100;

		System.out.println("tax amount is:"+total);

	}

}

}