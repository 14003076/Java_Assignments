import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RectangleShape {
	private RectangleShapes rectangle1;
    private RectangleShapes rectangle2;
	@Before
	public void display()
	{
		rectangle1 = new RectangleShapes();
        rectangle2 = new RectangleShapes();
        rectangle1.set(4, 5);
        rectangle2.set(3, 6);
	}
	@After
	public void display1()
	{
		System.out.println("After");
	}

	@Test
	public void test() {
         boolean flag = RectangleShapes.equalArea(rectangle1, rectangle2);
         assertFalse(flag);
         
	}

}
