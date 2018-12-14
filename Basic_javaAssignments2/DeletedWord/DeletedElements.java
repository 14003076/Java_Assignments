
public class DeletedElements {
     public String display(String input,String word ,int position )
     {
    	
    	 String words[] = input.split(" +");
    	 
    	 for(int count=0;count<words.length;count++)
    	 {
    			 if(words[count].equals(word)&& position==count+1)
        		 {
    			      words[count]="";
    			      break;
 				 }
    	 }
    	    	String temporary = String.join(" ",words);
    	      String answer = temporary.replaceAll(" +"," ");
    	      System.out.println(answer);
              return answer;
     }
}    