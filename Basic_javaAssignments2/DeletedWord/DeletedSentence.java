import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DeletedSentence {
	@Before
	public void seUp(){
		System.out.println("Before");
	}
	@After
	public void tearDown1(){
		System.out.println("After");
	}
	@Test
	public void test(){
		 DeletedElements element = new  DeletedElements();
		    String elements1 =  element.display( "A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.","IS",6 );
			assertEquals(elements1,"A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.");//fail("Not yet implemented");
			
	}
	@Test
	public void test1(){
		 DeletedElements element = new  DeletedElements();
		    String elements1 =  element.display("AS YOU    SOW, SO   SO YOU REAP.","SO",4 );
			assertEquals(elements1,"AS YOU SOW, SO YOU REAP.");//fail("Not yet implemented");
			
	}

}
