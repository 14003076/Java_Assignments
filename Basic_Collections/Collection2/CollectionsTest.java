import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;


public class CollectionsTest {

	private Car carOne,carTwo,carThree;

	private Television televisionOne,televisionTwo,televisionThree;

	private CellPhone cellPhoneOne,cellPhoneTwo,cellPhoneThree;

	private School schoolOne,schoolTwo,schoolThree;

	@Before

	public void setUp() {

		carOne = new Car("RR", "Model 1",2016, 50000);
		carTwo = new Car("RR", "Model 1", 2017, 2500000);
		carThree = new Car("Skoda", "Model 3", 2018, 1500000);

		televisionOne = new Television("Sony", "LCD", false, 50000);
		televisionTwo = new Television("Sony", "LCD", true, 50000);
		televisionThree = new Television("SAMSUNG", "PLASMA", false, 25000);

		cellPhoneOne = new CellPhone("SAMSUNG", "NOTE", "NOTE9 : Retina Scan, Dual Camera", "ANDROID 8", 70000);
		cellPhoneTwo = new CellPhone("APPLE", "IPHONE", "IPHONE X : A11 PROCESSOR", "IOS 11", 100000);
		cellPhoneThree = new CellPhone("SAMSUNG", "NOTE","McLAREN : New Edition", "ANDROID 8", 50000);

		schoolOne = new School("LAP", "CHILLAKUR", "NELLORE", 2);
		schoolTwo = new School("CAM", "GUDUR", "NELLORE", 1);
		schoolThree = new School("LAP", "CHILLAKUR", "NELLORE", 3);

	}

	@Test

	public void carTest() {

		HashSet<Car> set = new HashSet<Car>();
		set.add(carOne);
		set.add(carTwo);
		set.add(carThree);
		String actual = set.toString();

		String expected ="[Car [make=RR, model=Model 1, year=2016, price=50000.0],"

						+ " Car [make=Skoda, model=Model 3, year=2018, price=1500000.0]]";

		assertEquals(expected,actual);

	}

	
	@Test

	public void televisionTest() {
		HashSet<Television> set = new HashSet<Television>();
		set.add(televisionOne);
		set.add(televisionTwo);
		set.add(televisionThree);
		String actual = set.toString();
		System.out.println(actual);
       String expected = "[Television [company=SAMSUNG, type=PLASMA, enabled3d=false, price=25000.0], Television [company=Sony, type=LCD, enabled3d=false, price=50000.0], Television [company=Sony, type=LCD, enabled3d=true, price=50000.0]]";
		assertEquals(expected,actual);

	}
	
	@Test

	public void cellPhoneTest() {
		HashSet<CellPhone> set = new HashSet<CellPhone>();
		set.add(cellPhoneOne);
		set.add(cellPhoneTwo);
		set.add(cellPhoneThree);
		String actual = set.toString();
		System.out.println(actual);
		String expected = "[CellPhone [company=SAMSUNG, model=NOTE, description=NOTE9 : Retina Scan, Dual Camera, operatingSystem=ANDROID 8, price=70000.0], CellPhone [company=APPLE, model=IPHONE, description=IPHONE X : A11 PROCESSOR, operatingSystem=IOS 11, price=100000.0]]";
		assertEquals(expected,actual);
	}

	@Test

	public void schoolTest() {

		HashSet<School> set = new HashSet<School>();
		set.add(schoolOne);
		set.add(schoolTwo);
		set.add(schoolThree);
		String actual = set.toString();
		System.out.println(actual);
		String expected = "[School [name=LAP, city=CHILLAKUR, schoolDistrict=NELLORE, greatSchoolRanking=2], School [name=LAP, city=CHILLAKUR, schoolDistrict=NELLORE, greatSchoolRanking=3], School [name=CAM, city=GUDUR, schoolDistrict=NELLORE, greatSchoolRanking=1]]";
		assertEquals(expected,actual);

	}

}

