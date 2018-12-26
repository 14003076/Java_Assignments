import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;


public class SchoolTest {
	private School object, object1, object2;

	@Before
	public void setUp() {
		object = new School("sai", "vijayawada", "krishna", "one");
		object1 = new School("sri", "guntur", "guntur", "two");
		object2 = new School("bhanu", "nalgonda", "nalgonda", "three");
	}

	@Test
	public void test() {
		// HashSet Declaration
		HashSet<School> set = new HashSet<School>();
		set.add(object);
		set.add(object1);
		set.add(object2);
		String expected = "[School [name=bhanu, city=nalgonda, district=nalgonda, rank=three], School [name=sri, city=guntur, district=guntur, rank=two], School [name=sai, city=vijayawada, district=krishna, rank=one]]";
		System.out.println(set);
		assertEquals(expected, set.toString());
	}
	

}
