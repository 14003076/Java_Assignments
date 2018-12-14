
public class SearchName {
  public int display(String[] words,String name){
	  int temporary = 0;
	  for(int count=0;count<words.length;count++)
	  {
		 
		  if(name.equals(words[count]))
		  {
			  temporary++;
		  }
	  }	  
			  System.out.println(temporary);
			 return temporary;
		  }	
		  
      }
	
