import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {
	private Person person;
	private Person person1;
	@Before
	public void setUp(){
		person = new Person("Ram",5,6,1980);
		person1 = new Person("Shayam",2,3,1987);
	}

	/*@Test
	public void test() {
		   person.display();                                 //fail("Not yet implemented");
	}*/
	@Test

	public void olderOne() {

		String expected="Ram is older than Shayam by 6 years ,8months, and 25days";
		String result = person1.olderOne(person,person1);
		assertEquals(expected,result);
	}
}
