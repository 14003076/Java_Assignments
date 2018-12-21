import java.io.File;

public class FileExistPath {
	 public boolean display(String expected1)
	 {
		 /*
		  * what file you wantto be read
		  */
		 File file = new File(expected1);
		 /*
		  * condition for checking file present or not
		  */
	    if(file.exists())
	    {
	    	return true;
	    }
		return false;
	}

	

}
