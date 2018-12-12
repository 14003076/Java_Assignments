import java.util.*;
public class Year
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter date in dd,mm,yyyy");
        sc.useDelimiter("\\D");                                      //using comas in input
        int date=sc.nextInt();
	
        int month=sc.nextInt();                                   //storing date,month,year values
	
        int year=sc.nextInt();

	System.out.println(date+"/"+month+"/"+year);
	
        if(month==01)
	{
		System.out.println(date+"/"+"january"+"/"+year);
	}
	
        if(month==02)
	{
		System.out.println(date+"/"+"february"+"/"+year);
	}
	
        if(month==03)
	{
		System.out.println(date+"/"+"march"+"/"+year);
	}
	
        if(month==04)
	{
		System.out.println(date+"/"+"April"+"/"+year);
	}
	
        if(month==05)
	{
		System.out.println(date+"/"+"may"+"/"+year);
	}
	
        if(month==06)
	{
		System.out.println(date+"/"+"june"+"/"+year);
	}
	
        if(month==07)
	{
		System.out.println(date+"/"+"july"+"/"+year);
	}
	
        if(month==08)
	{
		System.out.println(date+"/"+"August"+"/"+year);
	}
	
        if(month==09)
	{
		System.out.println(date+"/"+"september"+"/"+year);
	}
	
        if(month==10)
	{
		System.out.println(date+"/"+"october"+"/"+year);
	}
	
        if(month==11)
	{
		System.out.println(date+"/"+"November"+"/"+year);
	}
	
        if(month==12)
	{
		System.out.println(date+"/"+"December"+"/"+year);
	}
  }

}