import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Calculator {
	@Before
	public void display1(){
		System.out.println("Before");
	}
	@After
	public void display2(){
		System.out.println("After");
	}
	
	Additionoftwonumbers addition = new Additionoftwonumbers(); 
	@Test
	 public void testadditionoftwonumbers() {	
	 int addition1 = addition.display(10,20);
		assertEquals(30, addition1);                ////compare original with expected output
	}

     @Test
     public void AdditionOfOneNegativeNumber() {	
     int addition1 = addition.display(-10,20);
	 assertEquals(10, addition1);                      //compare original with expected output
}
     @Test
	 public void AdditionofTwoNegativeNumbers() {	
	 int addition1 = addition.display(-10,-20);
		assertEquals(-30, addition1);
	}
     @Test
	 public void AdditionofTwozeroNumbers() {	
	 int addition1 = addition.display(0,0);
		assertEquals(0, addition1);
	}
     @Test
	 public void AdditionofonezeroAndPositive() {	
	 int addition1 = addition.display(0,7);
		assertEquals(7, addition1);
	}
     @Test
	 public void AdditionofonezeroAndnegative() {	
	 int addition1 = addition.display(0,-7);
		assertEquals(-7, addition1);
	}
}
