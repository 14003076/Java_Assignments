import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DiscountOffers {
	private Offers offers;
	@Before
	public void display(){
		offers = new Offers();
	}

	@Test
	public void test() {
		assertEquals(1300, offers.displayDiscount(2000));
		
		                 
	}

}
