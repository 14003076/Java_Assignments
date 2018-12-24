import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainingTest {

	private Training publicTraining;
	private Training corporateTraining;

	@Before

	public void setUp(){

		publicTraining = new PublicTraining("Java",5000,50);

		corporateTraining = new CorporateTraining("IOT",35000,4);


	}

	@Test

	public void publicTrainingCost() {

		int expected = 250000;

		int actual = publicTraining.getOrderValue();

		assertEquals(expected,actual);

	}


	@Test

	public void publicCorporateCost() {

		int expected = 1400;

		int actual = corporateTraining.getOrderValue();

		assertEquals(expected,actual);

	}

}
