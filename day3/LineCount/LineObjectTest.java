import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
public class LineObjectTest {
     private  Lines lines;
     @Before
     public void setUp()
     {
    	 lines = new Lines();
     }
     
	@Test
	public void test() throws IOException {
		FileReader fileReader = new FileReader("C:\\Users\\shabzsha\\Documents\\hi.txt");
	    int  expected = 1;
		int result = lines.display(fileReader);
		assertEquals(expected, result);
	}

}