
public class ReverseNumber {
   public int display1(int number){
    	 int sum = 0;
    	 while(number>0)
    	 {
    		 
    		 int remainder = number%10;
    		 number = number/10;
    		 sum = (sum * 10) + remainder; 
    	 }
		if(sum==number)
			return 1;
     else 
	
     	return 0;
    	 
     }
}
