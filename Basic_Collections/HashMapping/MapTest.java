import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class MapTest {

	private HashMapping hashOne, hashTwo, hashThree, hashFour, hashFive;

	@Before
	public void setUp() {
		hashOne = new HashMapping("Apple");
		hashTwo = new HashMapping("Strawberry");
		hashThree = new HashMapping("Banana");
		hashFour = new HashMapping("BlackBerry");
		hashFive = new HashMapping("PineApple");

	}

	@Test
	public void mappingTest() {
		Map<String, HashMapping> favourite = new HashMap<String, HashMapping>();
		favourite.put("sai", hashOne);
		favourite.put("sri", hashTwo);
		favourite.put("shabzan", hashThree);
		favourite.put("ram", hashFour);
		favourite.put("Manoj", hashFive);

		Set set = favourite.entrySet();
		Iterator iterate = set.iterator();
		String actual = set.toString();
		System.out.println(actual);
		String expected = "[shabzan=HashMapping [fruits=Banana], sai=HashMapping [fruits=Apple], sri=HashMapping [fruits=Strawberry], ram=HashMapping [fruits=BlackBerry], Manoj=HashMapping [fruits=PineApple]]";

		assertEquals(expected, actual);
		String expectedFavourite = "HashMapping [fruits=BlackBerry]";
		assertEquals(expectedFavourite, favourite.get("ram").toString());

	}

}
