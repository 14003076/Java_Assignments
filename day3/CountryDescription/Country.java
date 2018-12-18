
public class Country {
	private String countryName;
	 private long population;
	 private long area;
	 @Override
	public String toString() {
		return "Country [countryName=" + countryName + ", population="
				+ population + ", area=" + area + "]";
	}
	Country(String countryName,long population,long area)
	 {
	    this.countryName  = countryName;
	    this.population = population;
	    this.area = area;
	 }
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public long getArea() {
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
	public static  String getCountryWithLargestArea(Country[] countryArray) {

		String largestAreaCountry = "";

		for(int index=0;index<countryArray.length;index++){

			for(int index1=index+1;index1<countryArray.length;index1++){

				if(countryArray[index].getArea()>=countryArray[index1].getArea()){

					Country temporaryObject = countryArray[index];

					countryArray[index] = countryArray[index1];

					countryArray[index1] = temporaryObject;

				}

			}

		}

		largestAreaCountry = countryArray[3].toString();        //assigning the largest country in terms of area to String variable.

		return largestAreaCountry.trim();

	}

	public static String getCountryWithLargestPopulation(Country[] countryArray) {

		String largestPopulationCountry = "";

		for(int index=0;index<countryArray.length;index++){

			for(int index1=index+1;index1<countryArray.length;index1++){

				if(countryArray[index].getPopulation()>=countryArray[index1].getPopulation()){

					Country temporaryObject = countryArray[index];

					countryArray[index] = countryArray[index1];

					countryArray[index1] = temporaryObject;

				}

			}

		}

		largestPopulationCountry = countryArray[3].toString();     //assigning the largest country in terms of population to String variable.

		return largestPopulationCountry.trim();

	}

	public  static String getCountryWithLargestPopulationDensity(

			Country[] countryArray) {

		String largestPopulationDensityCountry = "";

		for(int index=0;index<countryArray.length;index++){

			for(int index1=index+1;index1<countryArray.length;index1++){

				if((countryArray[index].getPopulation()/countryArray[index].getArea())>=(countryArray[index1].getPopulation()/countryArray[index1].getArea())){

					Country temporaryObject = countryArray[index];

					countryArray[index] = countryArray[index1];

					countryArray[index1] = temporaryObject;

				}

			}

		}

		largestPopulationDensityCountry = countryArray[3].toString();     //assigning the largest country in terms of population density to String variable.

		return largestPopulationDensityCountry.trim();

	}

}
