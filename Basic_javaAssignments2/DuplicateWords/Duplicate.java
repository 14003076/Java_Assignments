
public class Duplicate {
     public String removeDuplicates(String letters)    
     {
    	  char alphabet;
    	  String result = "";                         //for storing result values
    	  for(int count=0;count<letters.length();count++)
    	  {
    		  alphabet = letters.charAt(count);           //single character displays
    		  if(alphabet!=' ')                              //checking the condition is any spaces are not equal
    			  result = result  + alphabet;              //Concatenation with result and alphabet
    		  letters = letters.replace(alphabet,' ');          //it replaces duplicates and prints single characters
    	  }
    	  System.out.println(result);
    	  return result;
     }
}
