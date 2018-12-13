import java.lang.String;
public class reversedString
{
	public String displayString(String str)
	
	{  
		String words[]=str.split("\\s");  
		String reverseWord="";  
		for(String word:words){  
        StringBuilder Word1=new StringBuilder(word);  
        Word1.reverse();  
        reverseWord+=Word1.toString()+" ";  
    }  
    return reverseWord.trim();  
}  
	
	
}
