import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DuplicateArray {
	@Before
	public void setup(){
		System.out.println("HELLO");
	}
	@After
	public void tearDown(){
		System.out.println("STOP");
	}
	
	 Duplicate replicate = new Duplicate();
	@Test
	public void test() {
		 String replicate1 = replicate.removeDuplicates("abcabcabc");
		 assertEquals("abc",  replicate1);                                //fail("Not yet implemented");
	}
	@Test
	public void test1() {
		 String replicate1 = replicate.removeDuplicates("javaforschool");
		 assertEquals("javforschl",  replicate1);                                //fail("Not yet implemented");
	}
	@Test
	public void test2() {
		 String replicate1 = replicate.removeDuplicates("Mississippi");
		 assertEquals("Misp",  replicate1);                                //fail("Not yet implemented");
	}

}
