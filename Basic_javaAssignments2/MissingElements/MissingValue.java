
public class MissingValue {
	public int missValues(int array[]) {

		int actualTotal=0;

		int currentTotal=0;

		for(int counter=0;counter<array.length;counter++)

		{

			currentTotal +=array[counter];

		}

		actualTotal=(array.length*(array.length+1))/2;

		actualTotal -=currentTotal;

		return actualTotal;

	}

}

