import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;


public class FilesExistTest {
        private FileExistPath fileExist;
        @Before
        public void setUp()
        {
        	fileExist = new FileExistPath(); 
        }
	@Test
	public void test() {
	String expected1 = "C:\\Users\\shabzsha\\Downloads\\SQL";
	boolean expected = true;
	 boolean result = fileExist.display(expected1); 
	 assertEquals(expected, result);
	}

}
