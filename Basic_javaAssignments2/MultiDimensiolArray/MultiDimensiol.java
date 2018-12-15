import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MultiDimensiol {
	@Before
	public void display(){
		System.out.println("Before");
	}
	@After
	public void tearDown(){
		System.out.println("After");
	}

	@Test
	public void testElementSearch() {
		 Multiple  elements = new Multiple();
		 int array[][] = {{1,2,30},{11,12,13},{11,15,16}};
		 boolean SearchElements = elements.searchNumber(11,array);
		 assertEquals(true, SearchElements);//fail("Not yet implemented");
	}

	@Test
	public void testNotFound() {
		 Multiple  elements = new Multiple();
		 int array[][] = {{1,2,30},{11,12,13},{11,15,16}};
		 boolean SearchElements = elements.searchNumber(10,array);
		 assertEquals(false, SearchElements);//fail("Not yet implemented");
	}

}
