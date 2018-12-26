import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class CellphoneTest {

	private Cellphone object, object1, object2;

	@Before
	public void setUp() {
		object = new Cellphone("hp", "2012eed", "unix", "good", 1419.13);
		object1 = new Cellphone("lenovo", "2013fg", "linux", "bad", 345312.089);
		object2 = new Cellphone("asus", "lkk2014", "windows", "excellent",
				234.089);
	}

	@Test
	public void test() {
		// HashSet Declaration
		HashSet<Cellphone> set = new HashSet<Cellphone>();
		set.add(object);
		set.add(object1);
		set.add(object2);
		String expected = "[Cellphone [company=asus, modelNumber=lkk2014, operatingSystem=windows, description=excellent, price=234.089], Cellphone [company=lenovo, modelNumber=2013fg, operatingSystem=linux, description=bad, price=345312.089], Cellphone [company=hp, modelNumber=2012eed, operatingSystem=unix, description=good, price=1419.13]]";
		System.out.println(set);
		assertEquals(expected, set.toString());
	}

}
