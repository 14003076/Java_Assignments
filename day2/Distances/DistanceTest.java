import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistanceTest {
	
	private Distance object1;
    private Distance object2;	
	@Before
	public void setUp() 
	{
		object1 = new Distance(8, 8.2);
		object2 = new Distance(8, 7.8);

	}

	@Test
	public void testDistance() {
		   double expectedResult = 17.4;
		   Distance finalResult = Distance.add(object1, object2);
		   finalResult.display();
		   double finalDistance = finalResult.feet+(finalResult.inches/10);
           assertEquals(expectedResult, finalDistance, 0);
	}

}
