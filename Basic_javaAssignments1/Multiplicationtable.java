import java.util.*;
 class Multiplicationtable {                      //class creation
	static void display(int number){             //function creation
		for(int i=1; i <= 10; i++)
        {
        	int mul=number*i;
        	int square=mul*mul;
            System.out.println(number+" * "+i+" = "+mul+"------>"+square);
        }	
	}
 
	public static void main(String[] args)          //main function
    {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();                //storing number
        display(number);                        //function calls
        sc.close();
    }
 }	