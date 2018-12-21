import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lines {
	int count = 0;
	public int display(FileReader fileReader) throws IOException
	 {
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((bufferedReader.readLine()) != null)   
		{
			count++;
		}
		return count;
	 }

}
