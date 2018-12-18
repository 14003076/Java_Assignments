import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CountryTest {
	private Country country1;
	private Country country2;
	private Country country3;
	private Country country4;
    public Country[] countryArray = new Country[4];
	
	@Before
	public void setUp(){
		country1 = new Country("India",121000000,32415414);
		country2 = new Country("Pakistan",121000,324414);
		country3 = new Country("Australia",12108,3095414);
		country4 = new Country("Germany",12132,32415);
        countryArray[0] = country1;
        countryArray[1] = country2;
        countryArray[2] = country3;
        countryArray[3] = country4;
	}
	

	@Test

	public void testCountryWithLargestArea() {

		String countryWithLargestArea = Country.getCountryWithLargestArea(countryArray);

		System.out.println(" country with largest Area: "+countryWithLargestArea);

		assertEquals("Country [countryName=India, population=121000000, area=32415414]", countryWithLargestArea);

	}

	@Test

	public void testCountryWithLargestPopulation() {

		String countryWithLargestPopulation = Country.getCountryWithLargestPopulation(countryArray);

		System.out.println(" country with largest Population: "+countryWithLargestPopulation);

		assertEquals("Country [countryName=India, population=121000000, area=32415414]", countryWithLargestPopulation);

	}

	

	@Test

	public void testCountryWithLargestPopulationDensity() {

		String countryWithLargestPopulationDensity = Country.getCountryWithLargestPopulationDensity(countryArray);

		System.out.println(" country with largest Population Density: "+countryWithLargestPopulationDensity);

		assertEquals("Country [countryName=India, population=121000000, area=32415414]", countryWithLargestPopulationDensity);

	}



}
