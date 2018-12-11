import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Number {

	@Before
     public void display(){
    	 System.out.println(" Before");
     }
	
	@After
    public void display2(){
   	 System.out.println("After");
    }
	@Test
	public void test() {
	   ReverseNumber object = new ReverseNumber();
	    int number1 =  object.display1(152);
	   assertEquals(0, number1);                       //compare original with expected output
	}
	@Test
	public void negativenumber() {
	   ReverseNumber object = new ReverseNumber();
	    int number1 =  object.display1(-152);
	   assertEquals(0, number1);                   //compare original with expected output
	}

}
