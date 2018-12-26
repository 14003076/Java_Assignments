import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class AddingOrderTest {

	private Order nameOrderOne,nameOrderTwo,nameOrderThree,nameOrderFour,nameOrderFive;

	@Before

	public void setUp(){

		nameOrderOne = new Order("sai");
		nameOrderTwo = new Order("priya");
		nameOrderThree = new Order("poojitha");
		nameOrderFour = new Order("Manoj");
		nameOrderFive = new Order("bhanu");
	}

	@Test

	public void test() {
       //arrayList declaration
		List<Object> listOfNames = new ArrayList<>();
		//adding objects to arrayList
		listOfNames.add(nameOrderOne);
		listOfNames.add(nameOrderTwo);
		listOfNames.add(nameOrderThree);
		listOfNames.add(nameOrderFour);
		listOfNames.add(nameOrderFive);
        
		Order list = new Order();
		List<Object> result = list.names(listOfNames);
		assertEquals(listOfNames, result);

	}

}
