import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class String {

	@Before
	public void display1(){
		System.out.println("Before");
	}
	@After
	public void display2(){
		System.out.println("After");
	}

	@Test
	public  void test() {
		reversedString reverse = new reversedString();
		
		assertEquals("s'teL ekat edoCteeL tsetnoc", reverse.displayString(("Let's take LeetCode contest")));//fail("Not yet implemented");
	}
	@Test
	@Ignore
	public  void testWrongOutput() {
		reversedString reverse = new reversedString();
		
		assertEquals("s'teL ekat edoCteeL tsetnoc", reverse.displayString(("This is an easy Java Program")));//fail("Not yet implemented");
	}
}
