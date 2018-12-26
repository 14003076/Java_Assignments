import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.Object;


public class LaptopTest {
	private Laptop object,object1,object2;
     
     @Before
     public void setUp(){
    	 object  = new Laptop("hp","2012eed","unix","i3");
    	 object1 = new Laptop("lenovo","2013fg","linux","i5");
    	 object2 = new Laptop("asus","lkk2014","windows","i7");
     }
     
	@Test
	public void test() {
          //HashSet Declaration		
		  HashSet<Laptop> set = new HashSet<Laptop>();
		  set.add(object);
		  set.add(object1);
		  set.add(object2);
		String expected = "[Laptop [company=asus, modelNumber=lkk2014, operatingSystem=windows, processor=i7], Laptop [company=lenovo, modelNumber=2013fg, operatingSystem=linux, processor=i5], Laptop [company=hp, modelNumber=2012eed, operatingSystem=unix, processor=i3]]";
	   System.out.println(set);
		assertEquals(expected, set.toString());
	}

}
