import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Names {
	private SearchName search;
	@Before
	public void setUp(){
		search = new SearchName();
	}
      
	@Test
	public void test() {
		 String[] words = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		 int searching = search.display(words,"Sam"); 
		 assertEquals(2, searching);
	}

}
