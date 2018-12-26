import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class AscendingOrderTest {

	private AscendingOrder nameOne,nameTwo,nameThree,nameFour,nameFive;

	@Before

	public void setUp(){
		nameOne =new AscendingOrder("sai");
		nameTwo =new AscendingOrder("sri");
		nameThree =new AscendingOrder("bhanu");
		nameFour =new AscendingOrder("Manoj");
		nameFive =new AscendingOrder("raga");

	}

	@Test

	public void ascendingTest() {
		List<AscendingOrder> nameList = new ArrayList<AscendingOrder>();
		nameList.add(nameOne);
		nameList.add(nameTwo);
		nameList.add(nameThree);
		nameList.add(nameFour);
		nameList.add(nameFive);	
        AscendingOrder list = new AscendingOrder();
		String actual = list.names(nameList).toString();
		String expected = "[AscendingOrder [name=Manoj],"
				+ " AscendingOrder [name=bhanu],"
				+ " AscendingOrder [name=raga],"
				+ " AscendingOrder [name=sai],"
				+ " AscendingOrder [name=sri]]";
		assertEquals(expected,actual);
		

	}
}
