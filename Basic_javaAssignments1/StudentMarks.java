import java.util.Scanner;

 public class StudentMarks
 {
    public static void main(String[] args)

    {
       Scanner scan=new Scanner(System.in);
       
       System.out.println("Enter subject1 marks");

       int subject1=scan.nextInt();

       System.out.println("Enter subject2 marks");

       int subject2=scan.nextInt();

       System.out.println("Enter subject3 marks");

       int subject3=scan.nextInt();
   
   if(subject1 > 60 && subject2 > 60 && subject3 > 60)
   
   {

       System.out.println("passed");

   }
 
   else if((subject1>60 || subject2>60 && subject3>60) && (subject2>60 || subject3>60 && subject1>60)&&(subject3>60 || subject1>60 && subject2>60))

   {

	System.out.println("promoted");

   }

   else 

   {

	System.out.println("Fail");

   }
}
}