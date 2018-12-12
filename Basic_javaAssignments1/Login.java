import java.util.*;
 
public class Login

{

   public static void main(String[] args)
   
   {
      
      	String  loginname = "shabzan";
      	String  password = "Password";
      	Scanner sc = new Scanner(System.in);
	int count = 0;
      	for(count=1;count<=3;count++)
      	{
		System.out.println("enter your loginname");
 		String loginname1 = sc.next();
 		System.out.println("enter your password");
      		String password1  = sc.next();
	if((loginname.equals(loginname1)) && (password.equals(password1)))               //comparing username and password
      	{
          		
          		System.out.println("welcome"+" " +loginname);                  //displaying welcome along with the username
      			break;
	}
     	}
     	if(count>3)                                                      //if number of attempts greater than 3 it will terminate
       	{ 
       		System.out.println("contact Admin");
        }
      
   }

} 