import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class NaturalOrderTest {

	private NaturalOrder nameOne,nameTwo,nameThree,nameFour,nameFive;

	@Before

	public void setUp(){
		nameOne =new NaturalOrder("sai");
		nameTwo =new NaturalOrder("sri");
		nameThree =new NaturalOrder("bhanu");
		nameFour =new NaturalOrder("Manoj");
		nameFive =new NaturalOrder("raga");

	}

	@Test

	public void naturalOrderTest() {
		List<NaturalOrder> nameList = new ArrayList<NaturalOrder>();
		nameList.add(nameOne);
		nameList.add(nameTwo);
		nameList.add(nameThree);
		nameList.add(nameFour);
		nameList.add(nameFive);	
        NaturalOrder list = new NaturalOrder();
		String actual = list.names(nameList).toString();
		String expected = "[NaturalOrder [name=Manoj],"
				+ " NaturalOrder [name=bhanu],"
				+ " NaturalOrder [name=raga],"
				+ " NaturalOrder [name=sai],"
				+ " NaturalOrder [name=sri]]";
		assertEquals(expected,actual);
		

	}
}
