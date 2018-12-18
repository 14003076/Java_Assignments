import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	private Triangle object1;
	private Triangle object2;
	private Triangle object3;
	private Triangle object4;
	
	
	@Before
	public void setUp()
	{
		object1 = new Triangle(3,4,5);
		object2 = new Triangle(3,4,5);
		object3 = new Triangle(3,3,5);
		object4 = new Triangle(3,3,3);
	}

	@Test
	public void testIsRight() {
		  assertTrue(object1.isRight());
	}
	@Test
	public void testIsScalene() {
		  assertTrue(object2.isScalene());
	}
	@Test
	public void testIsIsosceles() {
		  assertTrue(object3.isIsosceles());
	}
	@Test
	public void testIsEquilateral() {
		  assertTrue(object4.isEquilateral());
	}

}
